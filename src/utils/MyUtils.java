package utils;

public class MyUtils {
    private MyUtils(){

    }

    public static double getAverage(int[] array) {
        int summa = 0;
        for (int i = 0; i < array.length; i++) {
            summa += array[i];
        }
        double sum = summa / array.length;
        return sum;
    }

    public static int getRandomFromRange(int left, int right){
        return (int) (Math.random() * right - left) + left;
    }

    public static void printForward(int[] array) {
        System.out.println("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("]");
    }

    public static void printReverse(int[] array) {
        System.out.println("[");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("]");
    }
}
