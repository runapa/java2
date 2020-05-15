package lesson11;

import data.Director;
import data.JSCompany;
import data.Manager;
import data.Worker;

public class ClassWork {
    public static void main(String[] args) {
        Director dir1 = new Director(
                "Chak", "Norris", "Combo"
        );

        Director dir2 = new Director(
                "Garry", "Oldman", "Itdept"
        );

        Manager man1 = new Manager(
                "Ivan",
                "Ivanov",
                35, 20_000, "Falcons"
        );

        Manager man2 = new Manager(
                "Ilja",
                "Prorok",
                27, 15_000, "Loser"
        );

        Worker[] workers = {dir1, dir2, man1, man2};
        JSCompany company = new JSCompany(workers);

        System.out.println(company.getYoungestWorker().getAge());

        company.companyReport();

        company.salaryRecalculate();

        company.companyReport();

    }
}
