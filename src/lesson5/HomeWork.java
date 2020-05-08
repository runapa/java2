package lesson5;

public class HomeWork {
    public static void main(String[] args) {
//        String sentence = "Please be informed that invoice will be payed tomorrow";
//        sentenceParsing(sentence);
//        System.out.println();
//        String shortWord = getShortWord(sentence);
//        System.out.println(shortWord);
//        System.out.println();
//        printOddWords(sentence);
//        System.out.println();
//        changeAndPrintWords(sentence);

        int[] array = {0, 0, 1, 3, 7, 9, 11};
        boolean result = getDublicates(array);
        System.out.println(result);
    }

    public static boolean getDublicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] == array[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void changeAndPrintWords(String sentence) {
        String[] words = sentence.split(" ");
        int i = 0, iMax = 0, indexMin = 0, indexMax = 0;
        String wMin = "", wMax = "";
        int min = 2147483647;
        while (i < words.length) {
            if (words[i].length() < min) {
                min = words[i].length();
                indexMin = i;
                wMin = words[i];
            }
            if (words[i].length() > iMax) {
                iMax = words[i].length();
                indexMax = i;
                wMax = words[i];
            }
            i++;
        }
        words[indexMin] = wMax;
        words[indexMax] = wMin;
        System.out.println();
        System.out.print("[");
        for (int j = 0; j < words.length; j++) {
            System.out.print(words[j] + " ");
        }
        System.out.print("[");
    }

    public static void printOddWords(String sentence) {
        String[] words = sentence.split(" ");
        int i = words.length - 1;
        // System.out.println(i);
        System.out.print("[");
        while (i >= 0) {
            String word = words[i];
            System.out.print(word + " ");
            i--;
        }
        System.out.print("]");
    }

    public static String getShortWord(String sentence) {
        String[] words = sentence.split(" ");
        String shortWord = "";
        int min = 2147483647;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < min) {
                //System.out.println(i + " - " + words[i]);
                min = words[i].length();
                shortWord = words[i];
            }
        }
        //System.out.println(shortWord);
        return shortWord;
    }

    public static void sentenceParsing(String sentence) {
        String[] words = sentence.split(" ");
        String longWord = "";
        int i = 0;
        while (i < words.length) {
            String word = words[i];
            if (word.length() > longWord.length()) {
                longWord = word;
            }
            i++;
        }
        System.out.println(longWord);
    }
}
