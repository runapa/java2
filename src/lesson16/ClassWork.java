package lesson16;

import data.*;

import java.util.*;

public class ClassWork {
    public static void main(String[] args) {
//        SimpleTriangle triangle = new SimpleTriangle(9, 10, 11);
          Employee employee = new Employee(55_000, "Ivan");
//
//        ArrayList<Employee> arrayList = new ArrayList();
//        System.out.println("arrayList.size(): " + arrayList.size());
//
//        arrayList.add(employee);
//
//        System.out.println("arrayList.size(): " + arrayList.size());
//        arrayList.clear();
//        System.out.println("arrayList.size(): " + arrayList.size());

        List<Shape> shapes = new ArrayList(10);

        shapes.add(new SimpleTriangle(9, 10, 7));
        shapes.add(new SimpleTriangle(7, 10, 8));
        shapes.add(new SimpleTriangle(8, 8, 6));


        shapes.add(new SimpleSquare(8));
        shapes.add(new SimpleSquare(7));
        shapes.add(new SimpleSquare(9));

        shapes.add(new SimpleCircle(9));
        shapes.add(new SimpleCircle(8));
        shapes.add(new SimpleCircle(10));

        Shape maxPerimeter = getShapeWithMaxPerimeter(shapes);
        System.out.println("Max perimeter shape: " + maxPerimeter);

        Shape minSquare = getShapeWithMinSquare(shapes);
        System.out.println("Min square shape: " + minSquare);


        //Write a Java program to create a new array list, add some colors (string) and print out the collection.
        List<String> colors = new ArrayList<>();
        colors.add("GREEN");
        colors.add("WHITE");
        colors.add("BLACK");

        System.out.println(colors);

        //Write a Java program to iterate through all elements in a array list.

        for (String color : colors){
            System.out.println("Color = " + color);
        }

        //Write a Java program to insert 10 element into the array list at the first position
        int c = 1;
        while (c <= 10){
            colors.add(0, "GREEN" + c);
            c++;
        }
        System.out.println(colors);
        //Write a Java program to print an element (at a specified index) from a given array list.

        for (int j = 0; j < colors.size(); j++) {
            if(j % 2 == 0){
                System.out.println(colors.get(j));
            }
        }

        //Write a Java program to update specific array element by given element (put words that contains "R" to lower case)
        String replace = "";
        for (int j = 0; j < colors.size(); j++) {
            if(colors.get(j).contains("R")){
                replace = colors.get(j).toLowerCase();
                colors.set(j, replace);
            }
        }
        System.out.println(colors);

        //Write a Java program to remove the third element from a array list. Call it several times.

        colors.remove(2);
        colors.remove(2);
        colors.remove(2);

        System.out.println(colors);

        //Write a Java program to search an element in a array list.

        String search = "WHITE";
        for (String color : colors){
            if(color.equalsIgnoreCase(search)){
                System.out.println(colors.indexOf(color));
            }
        }

        System.out.println(colors.indexOf(search));

        //Write a Java program to copy one array list into another.
        List<String> list1 = new ArrayList<>();
        list1.add("A1");
        list1.add("B1");
        List<String> list2 = new ArrayList<>();
        list2.add("A2");
        list2.add("B2");
        list2.add("C2");

        Collections.copy(list2, list1);
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        //Write a Java program to shuffle elements in a array list.
        Collections.shuffle(colors);
        System.out.println(colors);
        //Write a Java program to reverse elements in a array list.

        Collections.reverse(colors);
        System.out.println(colors);

        Set<Employee> employees = new TreeSet<>();
        employees.add(employee);
    }

    public static Shape getShapeWithMinSquare(List<Shape> shapes) {
        Shape minSquare = shapes.get(0);
        for (int i = 0; i > shapes.size(); i++) {
            if (shapes.get(i).getSquare() < minSquare.getSquare()) {
                minSquare = shapes.get(i);
            }
        }
        return minSquare;
    }

    public static Shape getShapeWithMaxPerimeter(List<Shape> shapes) {
        Shape max = shapes.get(0);
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i).getPerimeter() > max.getPerimeter()) {
                max = shapes.get(i);
            }
        }
        return max;
    }
}