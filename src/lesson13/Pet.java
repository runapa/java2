package lesson13;

import enums.Name;

import java.util.Objects;

import static utils.MyUtils.getRandomFromRange;
import static utils.MyUtils.getRandomNameFromNameEnum;

public class Pet {
    private int age;
    private Name name;
    private int weight;

    public Pet() {
        this.age = getRandomFromRange(1, 5);
        this.name = getRandomNameFromNameEnum();
        this.weight = getRandomFromRange(2,5);
    }

    public int getAge() {
        return age;
    }

    public Name getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public static void printPetsTwins(Pet[] petsArr){
        for (int i = 0; i < petsArr.length; i++) {
            boolean isUniq = false;
            for (int j = i + 1; j < petsArr.length; j++) {
                if(petsArr[i].equals(petsArr[j])){
                    System.out.println("{" + petsArr[i].getName() + "[" + i + "]} has twins");
                }
                break;
            }
            System.out.println(petsArr[i]);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age &&
                weight == pet.weight &&
                name == pet.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, weight);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "age=" + age +
                ", name=" + name +
                ", weight=" + weight +
                '}';
    }
}
