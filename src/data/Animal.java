package data;

public class Animal {

    public Animal(String name, int age, Gender gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    String kind;
    final String name;
    final Gender gender;
    int age;
}
