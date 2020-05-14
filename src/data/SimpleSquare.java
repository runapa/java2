package data;

public class SimpleSquare extends Shape{
    private int a;

    public SimpleSquare(int a) {
        this.a = a;
    }

    public double getPerimeter(){
        System.out.println("Hello from Square");
        return 4 * a;
    }

    public double getSquare(){
        return a * a;
    }
}
