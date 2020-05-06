public class Lesson3 {
    public static void main(String[] args) {
        String[] arrStr = new String[3];
        System.out.println(arrStr[0]);

        int [] squareArr = {1, 2, 9, 8, 11, 99};

        printIntArray(squareArr);

    }

    public static void printIntArray(int [] arrayToPrint){
        System.out.print("[");
        for(int i = 0; i < arrayToPrint.length; i++){
            System.out.print(arrayToPrint[i] + ", ");
        }
        System.out.print("]");
    }
}
