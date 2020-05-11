package data;

public class Point {
    private int x1, x2, x3;
    private int y1, y2, y3;

    public Point(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    private void sidesCheck() {
        double[] arr = abc();
        if (arr[0] <= 0 || arr[1] <= 0 || arr[2] <= 0) {
            throw new IllegalArgumentException("Not valid arguments");
        }

        double ab = arr[0] + arr[1];
        double bc = arr[1] + arr[2];
        double ac = arr[0] + arr[2];
        if (ab < arr[2] || bc < arr[0] || ac < arr[1]) {
            throw new IllegalArgumentException("Not valid arguments");
        }
    }

    private double[] abc() {
        double[] abc = new double[3];
        abc[0] = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        abc[1] = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        abc[2] = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        return abc;
    }

    public double getA(){
        return abc()[0];
    }

    public double getB(){
        return abc()[1];
    }

    public double getC(){
        return abc()[2];
    }
}
