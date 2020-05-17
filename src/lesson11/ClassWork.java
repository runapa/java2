package lesson11;

import data.*;

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

        Developer dev1 = new Developer(
                "Andrei",
                "Kirilov",
                35,
                47_000,
                "PHP"
        );

        Developer dev2 = new Developer(
                "Ivan",
                "Parhomenko",
                43,
                57_000,
                "JAVA"
        );

        QualityAssurance qna1 = new QualityAssurance(
                "Alex",
                "Lukjanov",
                28,
                12_000,
                "Falconiada"
        );

        Worker[] workers = {dir1, dir2, man1, man2, dev1, dev2, qna1};
        JSCompany company = new JSCompany(workers);

        System.out.println(company.getYoungestWorker().getAge());

        company.companyReport();

        company.salaryRecalculate();

        company.companyReport();

        System.out.println();

        company.companyWorkersReport();
    }
}
