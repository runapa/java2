package lesson13;

import data.Auto;
import data.Director;
import data.Employee;
import enums.Color;
import lesson12.Sphere;

public class ClassWork {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        Sphere sphere1 = new Sphere(6);
        Sphere sphere2 = new Sphere(6);

        Employee emp1 = new Employee(35_000, new String("Ivan"));
        Employee emp2 = new Employee(35_000, new String("Ivan"));

        System.out.println(emp1.equals(emp2));

        System.out.println(emp1.equals(sphere1));

        System.out.println(sphere1);

        System.out.println(emp1);

        Director dir1 = new Director("Ivan", "Ivanov", "IT");
        String s = dir1.toString();
        System.out.println(s);

        Auto auto1 = new Auto(Color.BLACK, 2200, 28000);

        System.out.println(auto1);

        System.out.println(sphere1.hashCode());
    }
}
