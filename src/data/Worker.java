package data;

import utils.MyUtils.*;

import static utils.MyUtils.*;

public abstract class Worker {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected long salary;

    public String toString(){
        return "\n first name  = " + firstName + ",\n last name = " + lastName + ", " +
                "\n age = " + age + ",\n salary = " + salary;
    }

    public Worker(String firstName, String lastName) {
        this(firstName, lastName, getRandomFromRange(10_000, 200_000));
    }

    public Worker(String firstName, String lastName, long salary) {
        //Telescopic constructor
        this(firstName, lastName, getRandomFromRange(18, 65), salary);
    }

    public Worker(String firstName, String lastName, int age, long salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public abstract void salaryReview();
}
