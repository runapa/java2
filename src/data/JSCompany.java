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
}
