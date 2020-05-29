package lesson14;

public class HomeWork {
    public static void main(String[] args) {
        String str = "Лопатал: слово в котором шесть букв";
        //printLongestAndShortestWord(str);
        //printAndSwapShortestAndLongestWords(str);
        //printSameLetterWords(str);
        int n = getFactorial(4);
        System.out.println(n);
    }

    public static void printSameLetterWords(String str){
        String replaced = str.replace(".", " ");
        replaced = replaced.replace(",", " ");
        replaced = replaced.replace(":", " ");
        replaced = replaced.replace(";", " ");
        replaced = replaced.toLowerCase();
        String[] words = replaced.split(" ");
        int cnt = 0;
        for (int i = 0; i < words.length; i++) {
            if(words[i].isEmpty() || words[i].length() == 1){
                continue;
            }
            if(words[i].charAt(0) == words[i].charAt(words[i].length() - 1)){
                System.out.println(words[i]);
                cnt++;
            }
        }
        if(cnt == 0){
            System.out.println("Words that has same letter in start and end not found");
        }
    }

    public static void printLongestAndShortestWord(String str) {
        String replaced = str.replace(".", " ");
        replaced = replaced.replace(",", " ");
        replaced = replaced.replace(":", " ");
        replaced = replaced.replace(";", " ");
        String[] words = replaced.split(" ");
        String shortest = words[0];
        String longest = words[0];
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() < shortest.length()){
                shortest = words[i];
            }
            if(words[i].length() > longest.length()){
                longest = words[i];
            }
        }
        String format = String.format("The shortest word is %s and the longest word is %s", shortest, longest);
        System.out.println(format);
    }

    public static void printAndSwapShortestAndLongestWords(String str){
        String replaced = str.replace(".", " ");
        replaced = replaced.replace(",", " ");
        replaced = replaced.replace(":", " ");
        replaced = replaced.replace(";", " ");
        String[] words = replaced.split(" ");
        String shortest = words[0];
        String longest = words[0];
        int shortIndex = 0;
        int longIndex = 0;
        for (int i = 0; i < words.length; i++) {
            if(words[i].isEmpty()){
                continue;
            }
            if(words[i].length() < shortest.length()){
                shortest = words[i];
                shortIndex = i;
            }
            if(words[i].length() > longest.length()){
                longest = words[i];
                longIndex = i;
            }
        }
        for (int i = 0; i < words.length; i++) {
            if(words[i] == shortest){
                words[shortIndex] = longest;
                words[longIndex] = shortest;
            }
        }
        for (int i = 0; i < words.length; i++) {
            if(words[i].isEmpty()){
                continue;
            }
            System.out.println(words[i]);
        }
    }




    public static int getFactorial(int n){
        if(n == 1){
            return 1;
        }
        int n1 = n * getFactorial(n - 1);
        return n1;
    }
}
