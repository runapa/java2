package data;

public class Employee {
    protected int salary;
    protected String name;

    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
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

    public String toString(){
        return "Employee{Salary = " + salary + ", name = " + name + "}";
    }
}
