package data;

public class Manager extends Worker{
    private String team;

    public Manager(String firstName, String lastName, int age, long salary, String team) {
        super(firstName, lastName, age, salary);
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public void salaryReview() {
        this.salary = this.salary + (750 * 12);
    }
}
