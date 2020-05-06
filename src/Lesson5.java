public class Lesson5 {
    public static void main(String[] args) {

        String [] strings = {"Ivan", "Joe", "Petr", "Olga", "Ilja"};

        String sentence = "Hello my friend. How are you ?";
        String[] words = sentence.split(" ");

        printFirstChr(strings);
        System.out.println();
        printNameAndSize(strings);
        System.out.println();

        printNameAndSize(words);
    }



    public static void printFirstChr(String[] names){
        int index = 0;
        while (index < names.length){
            String name = names[index];
            if(name.startsWith("I")){
                System.out.println(name);
            }
            index++;
        }
    }

    public static void printNameAndSize(String[] names){
        int index = 0;
        while (index < names.length){
            String name = names[index];
            System.out.println(name + "- " + name.length());
            index++;
        }
    }

    public static void printArray(int[] array) {
        System.out.print("[ ");
        int count = 0;
        while (count < array.length) {
            System.out.print(array[count] + ", ");
            count++;
        }
        System.out.print("]");
    }

    public static void printHello(int printCount) {
        int count = 0;
        while (count < printCount) {
            System.out.print("Hello ");
            count++;
        }
    }
}
