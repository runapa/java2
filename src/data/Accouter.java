package data;

public class Accouter extends Employee{
    private int numberOfEmployee;

    public Accouter(int salary, String name, int numberOfEmployee) {
        super(salary, name);
        this.numberOfEmployee = numberOfEmployee;
    }

    public int getNumberOfEmployee() {
        return numberOfEmployee;
    }
}
