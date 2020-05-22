package lesson13;


import static lesson13.Pet.printPetsTwins;

public class HomeWork13 {
    public static void main(String[] args) {
        Pet[] petsArr = getPetsArray(100);
        printPetsTwins(petsArr);
    }

    public static Pet[] getPetsArray(int qty){
        Pet[] array = new Pet[qty];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Pet();
        }
        return array;
    }
}
