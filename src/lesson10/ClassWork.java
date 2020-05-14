package lesson10;

import data.*;

public class ClassWork {
    public static void main(String[] args) {
        Employee ivan = new Accouter(20_000, "Ivan", 50);
        Employee irina = new Accouter(30_000, "Irina", 60);
        Employee nikolai = new Accouter(60_000, "Nikolai", 30);

        String[] joeLanguages = {"Java", "JS"};
        Employee joe = new Programmer(100_000, "Joe", joeLanguages);
        String[] filLanguages = {"PHP", "JS"};
        Employee fil = new Programmer(55_000, "Fil", filLanguages);

        Employee markus = new Admin(25_000, "Markus", "IT");
        Employee bruno = new Admin(35_000, "Bruno", "HR");

        Employee[] employees = {ivan, irina, nikolai, joe, fil, markus, bruno};

        Employee employeeWithMaxSalary = employees[0];
        for (int i = 1; i < employees.length; i++) {
            Employee curent = employees[i];
            if (curent.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = curent;
            }
        }

        System.out.println("Employee max salary: " + employeeWithMaxSalary.getSalary());

        if (employeeWithMaxSalary instanceof Programmer) {
            System.out.println("Programmer has max salary");
        }

        if (employeeWithMaxSalary instanceof Admin) {
            System.out.println("Admin has max salary");
        }

        if (employeeWithMaxSalary instanceof Accouter) {
            System.out.println("Accouter has max salary");
        }

        SimpleTriangle triangle1 = new SimpleTriangle(9, 10, 7);
        SimpleTriangle triangle2 = new SimpleTriangle(7, 10, 8);
        SimpleTriangle triangle3 = new SimpleTriangle(8, 8, 6);

        SimpleSquare square1 = new SimpleSquare(8);
        SimpleSquare square2 = new SimpleSquare(7);
        SimpleSquare square3 = new SimpleSquare(9);

        SimpleCircle circle1 = new SimpleCircle(9);
        SimpleCircle circle2 = new SimpleCircle(8);
        SimpleCircle circle3 = new SimpleCircle(10);

        Shape[] shapes = {
                triangle1, triangle2, triangle3,
                square1, square2, square3,
                circle1, circle2, circle3
        };



        System.out.println();

        System.out.println(triangle3.getSquare());


//        Accouter[] accouters = {ivan, irina, nikolai};
//        Programmer[] programmers = {joe, fil};
//        Admin[] admins = {markus, bruno};
//
//        Accouter accouterWithMaxSalary = accouters[0];
//        for (int i = 1; i < accouters.length; i++) {
//            Accouter curent = accouters[i];
//            if (curent.getSalary() > accouterWithMaxSalary.getSalary()) {
//                accouterWithMaxSalary = curent;
//            }
//        }
//
//        Programmer programmerWithMaxSalary = programmers[0];
//        for (int i = 1; i < programmers.length; i++) {
//            Programmer curent = programmers[i];
//            if (curent.getSalary() > programmerWithMaxSalary.getSalary()) {
//                programmerWithMaxSalary = curent;
//            }
//        }
//
//        Admin adminWithMaxSalary = admins[0];
//        for (int i = 1; i < admins.length; i++) {
//            Admin curent = admins[i];
//            if (curent.getSalary() > adminWithMaxSalary.getSalary()) {
//                adminWithMaxSalary = curent;
//            }
//        }
//
//        int progMax = programmerWithMaxSalary.getSalary();
//        String progName = programmerWithMaxSalary.getName();
//
//        int accMax = accouterWithMaxSalary.getSalary();
//        String accName = accouterWithMaxSalary.getName();
//
//        int admMax = adminWithMaxSalary.getSalary();
//        String admName = accouterWithMaxSalary.getName();
//
//        if (progMax > accMax && progMax > admMax) {
//            System.out.println("Programmer has a bigest salary " + progName + " - " + progMax);
//        }
//
//        if (accMax > progMax && accMax > admMax) {
//            System.out.println("Accouter has a bigest salary " + accName + " - " + accMax);
//        }
//
//        if (admMax > accMax && admMax > progMax) {
//            System.out.println("Programmer has a bigest salary " + admName + " - " + admMax);
//        }
    }
}
