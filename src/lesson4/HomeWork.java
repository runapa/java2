package lesson4;

public class HomeWork {
    public static void main(String[] args) {
        int [] [] result1 = getTwoDimensionalIntArray(3, 1, 3);
        printTwoDimensionalIntArray(result1);

        System.out.println();

        int [] [] result2 = getTwoDimensionalIntArray(3, 1, 3);
        printTwoDimensionalIntArray(result2);

        System.out.println();

        int [] [] res = getProductOfMatrix(result1, result2);
        printTwoDimensionalIntArray(res);
    }

    public static int [] [] getProductOfMatrix(int [] [] matrix1, int [] [] matrix2){
        int[][] res = new int[matrix1.length][matrix2.length];
        for (int i = 0; i < matrix1.length ; i++) {
            for (int j = 0; j < matrix2.length ; j++) {
                res[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        return res;
    }

    public static int [] [] getTwoDimensionalIntArray(int capacity, int left, int right){
        int [][] array = new int[capacity][capacity];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * (right - left)) + left;
            }
        }
        return array;
    }

    public static void minMaxChangeTwoDimensionalIntArray(int [][] array){
        int iMax = 0;
        int iMin = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i][j] > iMax){
                    iMax = array[i][j];
                }
                if(array[i][j] < iMin){
                    iMin = array[i][j];
                }
            }
        }
        System.out.println("iMax = " + iMax);
        System.out.println("iMin = " + iMin);
        int temp = iMax;
        iMax = iMin;
        iMin = temp;
        System.out.println();
        System.out.println("iMax = " + iMax);
        System.out.println("iMin = " + iMin);
    }

    public static void printTwoDimensionalIntArray(int [][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void twoDimensionalIntArraySum(int [][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println(sum);
    }

    //Честно украдено и допилено
    public static double [] getProductOfNumbers(int [] arr1, double [] arr2){
        double [] result = new double[arr1.length];
        if(arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                result[i] = arr1[i] * arr2[i];
            }
        }
        return result;
    }

    public static void printMinAndMaxIndex(int [] array){
        int iMax = 0;
        int iMin = 0;
        for (int i = 1; i < array.length; i++) {
            if(array[i] > array[iMax]){
                iMax = i;
            }
            if(array[i] < array[iMin]){
                iMin = i;
            }
        }
        System.out.println(iMax);
        System.out.println(iMin);
    }

    public static int [] getRandomArray(int capacity, int left, int right){
        int[] array = new int[capacity];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (right - left)) + left;
        }
        return array;
    }

    public static void printOddAndEven(int [] array){
        int cntEven = 0;
        int cntOdd = 0;

        for (int i = 0; i < array.length; i++) {
            if((array[i] % 2) == 0){
                cntEven++;
            }else{
                cntOdd++;
            }
        }
        System.out.println("Even count = " + cntEven);
        System.out.println("Odd count = " + cntOdd);
    }

    //Честно украдено и допилено
    public static int[] getFibonachi(int capacity) {
        int[] array = new int[capacity];
        int x = 1;
        int y = 0;
        for (int i = 0; i < capacity; i++) {
            x += y;
            y = x - y;
            array[i] = y;
        }
        return array;
    }

    public static void printIntArray(int [] array){
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("]");
    }

    public static void printDoubleArray(double [] array){
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("]");
    }
}
