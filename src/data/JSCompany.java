package data;

public class JSCompany {
    private Worker[] workers;

    public Worker[] getWorkers() {
        return workers;
    }

    public JSCompany(Worker[] workers) {
        this.workers = workers;
    }

    public Worker getYoungestWorker() {
        Worker youngest = workers[0];
        int index = 1;
        while (index < workers.length) {
            if (workers[index].getAge() < youngest.getAge()) {
                youngest = workers[index];
            }
            index++;
        }
        return youngest;
    }

    public void salaryRecalculate() {
        int i = 0;
        do {
            workers[i].salaryReview();
            i++;
        } while (i < workers.length);
    }

    public void companyReport(){
        for (int i = 0; i < workers.length; i++) {
            Worker worker = workers[i];
            String format = String.format(
                    "Name %s, Lastname %s, Salary %d",
                    worker.getFirstName(), worker.getLastName(), worker.getSalary()
            );
            System.out.println(format);
        }
        System.out.println();
    }

    public Worker getMinimalSalary(){
        Worker salary = workers[0];
        for (int i = 1; i < workers.length; i++) {
            if(workers[i].getSalary() < salary.getSalary()){
                salary = workers[i];
            }
        }
        return salary;
    }

    public Worker getMaximumSalary(){
        Worker salary = workers[0];
        for (int i = 1; i < workers.length; i++) {
            if(workers[i].getSalary() > salary.getSalary()){
                salary = workers[i];
            }
        }
        return salary;
    }

    public Worker getOldestWorker(){
        Worker age = workers[0];
        int i = 0;
        while (i < workers.length){
            if(workers[i].getAge() > age.getAge()){
                age = workers[i];
            }
            i++;
        }
        return age;
    }

    public void companyWorkersReport(){
        Worker minSalary = getMinimalSalary();
        Worker maxSalary = getMaximumSalary();
        Worker youngestWorker = getYoungestWorker();
        Worker oldestWorker = getOldestWorker();

        String maxSalaryPrint  =
                String.format(
                    "%s %s has a maximum salary among the company. Salary: %d, Age: %d, Position: %s",
                    maxSalary.getFirstName(), maxSalary.getLastName(), maxSalary.getSalary(), maxSalary.getAge(), maxSalary.getClass().getSimpleName()
                );
        System.out.println(maxSalaryPrint);

        String minSalaryPrint  =
                String.format(
                    "%s %s has a minimum salary among the company. Salary: %d, Age: %d, Position: %s",
                    minSalary.getFirstName(), minSalary.getLastName(), minSalary.getSalary(), minSalary.getAge(), minSalary.getClass().getSimpleName()
                );
        System.out.println(minSalaryPrint);

        String oldestWorkerPrint  =
                String.format(
                    "%s %s has a maximum age among the company. Salary: %d, Age: %d, Position: %s",
                    oldestWorker.getFirstName(), oldestWorker.getLastName(), oldestWorker.getSalary(), oldestWorker.getAge(), oldestWorker.getClass().getSimpleName()
                );
        System.out.println(oldestWorkerPrint);

        String youngestWorkerPrint  =
                String.format(
                    "%s %s has a minimum age among the company. Salary: %d, Age: %d, Position: %s",
                    youngestWorker.getFirstName(), youngestWorker.getLastName(), youngestWorker.getSalary(), youngestWorker.getAge(), youngestWorker.getClass().getSimpleName()
                );
        System.out.println(youngestWorkerPrint);
    }
}