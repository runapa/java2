package utils;

import data.Shape;

public class MyUtils {
    private MyUtils(){

    }

    public static double getAverage(int[] array) {
        int summa = 0;
        for (int i = 0; i < array.length; i++) {
            summa += array[i];
        }
        double sum = summa / array.length;
        return sum;
    }

    public static int getRandomFromRange(int left, int right){
        return (int) (Math.random() * right - left) + left;
    }

    public static void printForward(int[] array) {
        System.out.println("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("]");
    }

    public static void printReverse(int[] array) {
        System.out.println("[");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("]");
    }

    public static void findMaxSquare(Shape[] shapes){
        Shape maxSquare = shapes[0];
        for (int i = 0; i < shapes.length; i++) {
            Shape current = shapes[i];
            if (current.getPerimeter() > maxSquare.getSquare()) {
                maxSquare = current;
            }
        }
        System.out.println("Maximum square is " + maxSquare.getSquare());
    }

    public static void findMinPerimeter(Shape[] shapes){
        Shape minPerimeter = shapes[0];
        for (int i = 0; i < shapes.length; i++) {
            Shape current = shapes[i];
            if (current.getPerimeter() < minPerimeter.getPerimeter()) {
                minPerimeter = current;
            }
        }

        System.out.println("Minimal perimeter is " + minPerimeter.getPerimeter());
    }
}
