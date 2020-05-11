package lesson8;

import data.Point;
import data.Triangle;

public class HomeWork {
    public static void main(String[] args) {
        Point a = new Point(2, 2);
        Point b = new Point(-2, -2);
        Point c = new Point(0, 0);

        Triangle triangle = new Triangle(a, b, c);
        System.out.println("Perimetr: " + triangle.getPerimeter());
    }
}
