package lesson14;

public class ClassWork {
    public static void main(String[] args) {
        //recursion(0);
        ////System.out.println(getFibo(6));
        printNumbers(20);

        String str = "Лопата, два слова лопата: лопата лопата. Два";
        //System.out.println(getCountOfWordsStartFrom(str, "p"));
        //printUniqWords(str);
    }

    public static void printUniqWords(String sentence){
        String replaced = sentence.replace(".", " ");
        replaced = replaced.replace(",", " ");
        replaced = replaced.replace(":", " ");
        replaced = replaced.replace(";", " ");
        String[] words = replaced.split(" ");
        for (int i = 0; i < words.length; i++) {
            if(words[i].isEmpty()){
                continue;
            }
            int count = 0;
            for (int j = 0; j < words.length; j++) {
                if(!(words[i].equalsIgnoreCase(words[j]))){
                    count++;
                }
                break;
            }
            if (count == 1){
                System.out.println(words[i]);
            }
        }
    }

/*    public static void printUniqWords(String sentence){
        String replaced = sentence.replace(".", " ");
        replaced = replaced.replace(",", " ");
        replaced = replaced.replace(":", " ");
        replaced = replaced.replace(";", " ");
        String[] words = replaced.split(" ");
        for (int i = 0; i < words.length; i++) {
            if(words[i].isEmpty()){
                continue;
            }
            boolean isUniq = true;
            for (int j = i + 1; j < words.length; j++) {
                if(words[i].equalsIgnoreCase(words[j])){
                    isUniq = false;
                    break;
                }
            }
            if (isUniq) {
                System.out.println(words[i]);
            }
        }
    }*/

    public static int getCountOfWordsStartFrom(String sentence, String startLetter){
        int cnt = 0;
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String mut = words[i].trim().toLowerCase();
            if(mut.startsWith(startLetter)){
                cnt++;
            }
        }
        return cnt;
    }

    public static void printNumbers(int n){
        if(n == 0){
            System.out.println(n);
            return;
        }
        int n1 = n - 1;
        printNumbers(n1);
        System.out.println(n);
    }

    public static int getFibo(int n){
        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        return getFibo(n - 2) + getFibo(n - 1);
    }

    public static void recursion(int i){
        if(i == 10){
            System.out.println("Basement");
            return;
        }
        System.out.println("i = " + i + "Hello, I am going dipper ...");
        recursion(++i);
    }
}
