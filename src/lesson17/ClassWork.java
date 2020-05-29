package lesson17;

import data.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class ClassWork {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "VAL1");
//        map.put(2, "VAL2");
//        map.put(3, "VAL3");
//
//        System.out.println(map);
//
//        Map<Long, Employee> map1 = new HashMap<>();
//        map1.put(38103060297L, new Employee(55_000, "JOE"));
//        map1.put(38103060298L, new Employee(65_000, "JACK"));
//
//        System.out.println(map1);
//
//        final Employee employee = map1.get(38103060297L);
//        System.out.println("38103060297L -> " + employee);

        //Write a Java program to associate the specified value with the specified key in a HashMap.

        Map<String, Shape> shapeMap = new HashMap<>();

        shapeMap.put("Triangle", new SimpleTriangle(3, 5, 5));
        shapeMap.put("Circle", new SimpleCircle(5));

        for (Map.Entry<String, Shape> entry : shapeMap.entrySet()) {
            System.out.println("Key - " + entry.getKey() + " Value " + entry.getValue());
        }

        //Write a Java program to count the number of key-value (size) mappings in a map

        int size = shapeMap.size();
        System.out.println(size);

        //Write a Java program to copy all of the mappings from the specified map to another map.

        Map<String, Shape> shapeMap1 = new HashMap<>();
        shapeMap1.put("Square7", new SimpleSquare(7));
        shapeMap1.put("Square9", new SimpleSquare(9));

        shapeMap.putAll(shapeMap1);

        System.out.println(shapeMap);

        //Write a Java program to check whether a map contains key-value mappings (empty) or not.Try to use .clear()

        shapeMap1.clear();
        System.out.println(shapeMap1.isEmpty());

        //Write a Java program to test if a map contains a mapping for the specified key.

        boolean what = shapeMap.containsKey("Square7");
        System.out.println(what);

        //Write a Java program to test if a map contains a mapping for the specified value.

        boolean whatValue = shapeMap.containsValue(new SimpleSquare(7));
        System.out.println(whatValue);

        //Write a Java program to create a set view of the mappings contained in a map.


        //Tree Set

        Set<Employee> treeSet = new TreeSet<>();
        treeSet.add(new Employee(17_000, "J"));
        treeSet.add(new Employee(20_000, "K"));

        System.out.println(treeSet);

        final EmployeeAgeComparator ageComparator = new EmployeeAgeComparator();
        Set<Employee> treeSetByAge = new TreeSet<>(ageComparator);
        treeSetByAge.add(new Employee(22_000, 35, "L"));
        treeSetByAge.add(new Employee(78_000, 19, "J"));
        treeSetByAge.add(new Employee(93_000, 55, "P"));

        System.out.println(treeSetByAge);

        final EmployeeSalaryComparator salaryComparator = new EmployeeSalaryComparator();
        Set<Employee> treeSetBySalary = new TreeSet<>(salaryComparator);
        treeSetBySalary.add(new Employee(98_120, 59, "LA"));
        treeSetBySalary.add(new Employee(92_000, 79, "AA"));
        treeSetBySalary.add(new Employee(18_100, 44, "AC"));

        System.out.println(treeSetBySalary);

        System.out.println("==============================================");

        Set<Employee> treeSetByName = new TreeSet<Employee>((o1, o2) -> o1.getName().compareTo(o2.getName()));

        treeSetByName.add(new Employee(98_120, 59, "LA"));
        treeSetByName.add(new Employee(92_000, 79, "AA"));
        treeSetByName.add(new Employee(18_100, 44, "AC"));

        System.out.println(treeSetByName);

        Employee newEmployee = null;
        final Constructor<?>[] constructorsEmp = Employee.class.getConstructors();
        for (Constructor constructor : constructorsEmp) {
            System.out.println(constructor.getParameterCount());
            if (constructor.getParameterCount() == 2) {
                newEmployee = (Employee) constructor.newInstance(66_000, "From Reflection");
            }
        }
        if(newEmployee !=  null){
            System.out.println(newEmployee);
        }

    }
}
