package data;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        checkIntegrity(a, b, c);
        this.a = a;
        this.b = a;
        this.c = a;
    }

    public double getPerimeter() {
        double ab = getDistance(a, b);
        double bc = getDistance(b, c);
        double ac = getDistance(a, c);
        return ab + bc + ac;
    }

    private void checkIntegrity(Point a, Point b, Point c){
        double ab = getDistance(a, b);
        double bc = getDistance(b, c);
        double ac = getDistance(a, c);

        if(ab + bc < ac || bc + ac < ab || ab + ac < bc){
            throw new IllegalArgumentException("Invalid points");
        }
    }

    private double getDistance(Point p1, Point p2) {
        int xKatet = p2.getX() - p1.getX();
        int yKatet = p2.getY() - p1.getY();
        return Math.sqrt(Math.pow(xKatet, 2) + Math.pow(yKatet, 2));
    }
}


//Создать треугольник с заданными координатами и посчитать его периметр;

// Объектно ориентированно и приватно

// Конструктор, геттеры, сеттеры не надо.