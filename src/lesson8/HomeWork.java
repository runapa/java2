package lesson8;

import data.Point;
import data.Triangle;

public class HomeWork {
    public static void main(String[] args) {
        Point point = new Point(0, 0, 3, 0, 0, 4);
        Triangle triangle = new Triangle(point.getA(), point.getB(), point.getC());
        System.out.println(triangle.getPerimeter());
    }
}
