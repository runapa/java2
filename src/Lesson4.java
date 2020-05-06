public class Lesson4 {
    public static void main(String[] args) {
        int array[] = getOddArray();
        double average = getAverage(array);
        System.out.println(average);
        method2();
    }


    public static int[] getOddArray() {
        int[] result = new int[15];
        int current = 1;

        for (int i = 0; i < result.length; i++) {
            if (current < 30) {
                result[i] = current;
            }
            current = current + 2;
        }
        printForward(result);
        printReverse(result);
        return result;
    }

    public static void method2() {
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20) - 10;
        }

        int iMax = 0;
        for (int i = 1; i < array.length; i++) {
            if(array[i] > array[iMax]){
                iMax = i;
            }
        }
        System.out.println("[");
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("]");

        System.out.println("------------------------------------");
        System.out.println("Maximum in array is: " + array[iMax]);

        int iMin = 0;
        for (int i = 1; i < array.length; i++) {
            if(array[i] < array[iMin]){
                iMin = i;
            }
        }
        System.out.println("------------------------------------");
        System.out.println("Maximum in array is: " + array[iMin]);
    }

    public static double getAverage(int[] array) {
        int summa = 0;
        for (int i = 0; i < array.length; i++) {
            summa += array[i];
        }
        double sum = summa / array.length;
        return sum;
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
