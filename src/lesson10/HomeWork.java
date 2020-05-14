package lesson10;

import data.Shape;
import data.SimpleCircle;
import data.SimpleSquare;
import data.SimpleTriangle;
import static utils.MyUtils.findMaxSquare;
import static utils.MyUtils.findMinPerimeter;

public class HomeWork {
    public static void main(String[] args) {
        SimpleTriangle triangle1 = new SimpleTriangle(9, 10, 7);
        SimpleTriangle triangle2 = new SimpleTriangle(7, 10, 8);
        SimpleTriangle triangle3 = new SimpleTriangle(8, 8, 6);

        SimpleSquare square1 = new SimpleSquare(8);
        SimpleSquare square2 = new SimpleSquare(7);
        SimpleSquare square3 = new SimpleSquare(9);

        SimpleCircle circle1 = new SimpleCircle(9);
        SimpleCircle circle2 = new SimpleCircle(8);
        SimpleCircle circle3 = new SimpleCircle(10);

        Shape[] shapes = {
                triangle1, triangle2, triangle3,
                square1, square2, square3,
                circle1, circle2, circle3
        };



        findMaxSquare(shapes);
        System.out.println();
        findMinPerimeter(shapes);
    }
}
