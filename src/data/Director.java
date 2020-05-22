package data;

public class Director extends Worker {
    private String department;

//    public Director(){
//        super();
//
//    }

    public String toString() {
        return this.getClass().getSimpleName() + "{ \n department = " + department + "," + super.toString() + "\n}";
    }

    public Director(String firstName, String lastName, String department) {
        super(firstName, lastName);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }


    @Override
    public void salaryReview() {
        this.salary = this.salary + (1500 * 12);
    }
}
