package lesson8;

import data.Person;
import data.SimpleTriangle;
import data.Student;
import data.Car;

public class ClassWork {
    public static void main(String[] args) {
        Student student = new Student("Nikolas");
        System.out.println(student.firstName);

        Car car = new Car(2000, 2006, 1980, "black", "BMW");

        Person person = new Person(40, "Joe");

        person.setAge(40);
        person.setFirstName("Ivan");

        System.out.println("Age: " + person.getAge());

        System.out.println("FirstName: " + person.getFirstName());

        SimpleTriangle simpleTriangle = new SimpleTriangle(9, 8, 7);
        System.out.println("Perimeter = " + simpleTriangle.getPerimeter());

        SimpleTriangle simpleTriangle1 = new SimpleTriangle(9, 8, 700);
        System.out.println("Perimeter = " + simpleTriangle1.getPerimeter());

    }


}
