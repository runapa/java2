package data;

public class SimpleCircle implements Shape{
    private int radius;

    public SimpleCircle(int radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        System.out.println("Hello from Circle");
        //return this.a + this.b + this.c;
        return 2 * Math.PI * radius;
    }

    public double getSquare(){
        return Math.PI * (radius * radius);
    }

    @Override
    public String toString() {
        return "SimpleCircle{" +
                "radius=" + radius +
                '}';
    }
}
