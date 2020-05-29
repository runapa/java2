package lesson17;

import data.Employee;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return  o1.getSalary() - o2.getSalary();
    }
}
