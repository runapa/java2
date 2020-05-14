package data;

public class Admin extends Employee{
    private String departament;

    public String getDepartament() {
        return departament;
    }

    public Admin(int salary, String name, String departament) {
        super(salary, name);
        this.departament = departament;
    }
}
