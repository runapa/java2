public class Student {
    int age;
    String firstName;
    String lastName;
    String email;
    String group;
    Long idCode;

    public void changeGroup(String newGroup) {
        this.group = newGroup;
    }

    public void getOlder() {
        //this.age = this.age + 1;
        this.age++;
    }
}
