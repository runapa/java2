package data;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = a;
        this.c = a;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getPerimeter() {

        return this.a + this.b + this.c;
        //System.out.println(a);

    }
}



//Создать треугольник с заданными координатами и посчитать его периметр;

// Объектно ориентированно и приватно

// Конструктор, геттеры, сеттеры не надо.