package data;

public class Person {
    private int age;
    private String firstName;

    public Person(int age, String firstName){
        this.age = age;
        this.firstName = firstName;
    }

    public int getAge() {
        return this.age;
    }

    public int setAge(int newAge){
        return this.age;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }
}
