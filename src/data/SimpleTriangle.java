package data;

public class SimpleTriangle extends Shape {
    private int a;
    private int b;
    private int c;

    public SimpleTriangle(int a, int b, int c) {
        sidescheck(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private void sidescheck(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Not valid arguments");
        }

        int ab = a + b;
        int bc = b + c;
        int ac = a + c;
        if (ab < c || bc < a || ac < b) {
            throw new IllegalArgumentException("Not valid arguments");
        }
    }

    public double getPerimeter() {
        System.out.println("Hello from Triangle");
        //return this.a + this.b + this.c;
        return a + b + c;
    }

    public double getSquare() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        sidescheck(a, this.b, this.c);
        this.a = a;
    }

    public void setB(int b) {
        sidescheck(this.a, b, this.c);
        this.b = b;
    }

    public void setC(int c) {
        sidescheck(this.a, this.b, c);
        this.c = c;
    }
}
