package data;

public class Employee implements Comparable<Employee>{
    protected int salary;
    protected int age;
    protected String name;

    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public Employee(int salary, int age, String name) {
        this.salary = salary;
        this.age = age;
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean equals(Object object){
        if(this == object){
            return true;
        }

        if(object instanceof Employee){
            Employee objectNew = (Employee) object;
            if(objectNew.getSalary() != salary ){
                return false;
            }
            if(!objectNew.getName().equals(name)){
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return o.getSalary() - this.salary;
    }
}