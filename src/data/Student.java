package data;

public class Student {
    int age;
    public String firstName;
    public String lastName;
    public String email;
    public String group;
    public Long idCode;

    public Student(String firstName){
        this.firstName = firstName;
    }

    public void changeGroup(String newGroup) {
        this.group = newGroup;
    }

    public void getOlder() {
        //this.age = this.age + 1;
        this.age++;
    }
}
