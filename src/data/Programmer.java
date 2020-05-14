package data;

public class Programmer extends Employee{
    private String[] languages;

    public Programmer(int salary, String name, String[] languages) {
        super(salary, name);
        this.languages = languages;
    }

    public String[] getLanguages() {
        return languages;
    }
}