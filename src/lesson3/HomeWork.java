package lesson3;

public class HomeWork {
    public static void main(String[] args) {
        double radius = getCircuit(4);
        System.out.println(radius);

        double s = getCircuitS(4);
        System.out.println(s);

        boolean triangle = getTriangle(1, 5, 3);
        System.out.println(triangle);

        double modulo = getModulo(10, 7);
        System.out.println(modulo);

        double[] arr = {2.0, 11.58, 123.589755, 7.5};
        printArray(arr);

        int[] integerArr = getArray(10, 1, 10);
        System.out.println("[ ");
        for (int i = 0; i < integerArr.length; i++) {
            System.out.print(integerArr[i] + ", ");
        }
        System.out.print("]");

        double value = getValue(5, 7, 9, 11, 29);
        System.out.println(value);
    }

    public static double getValue(double a, double b, double c, double d, double e) {
        return (a + b + c + d + e) / 5;
    }

    public static int[] getArray(int capacity, int intervalMin, int intervalMax) {
        int[] arr = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            int random = (int) (Math.random() * intervalMax) + intervalMin;
            arr[i] = random;
        }
        return arr;
    }

    public static void printArray(double[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("]");
    }

    public static double getModulo(double a, double b) {
        return a % b;
    }

    public static boolean getTriangle(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        } else {
            return false;
        }
    }

    public static double getCircuit(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double getCircuitS(double radius) {
        return Math.PI * (radius * radius);
    }
}
