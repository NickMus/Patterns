package Observer;

public class Main {
    public static void main(String[] args) {
        JobSite jobSite = new JobSite();

        jobSite.addVacancy("vacancy 1");
        jobSite.addVacancy("vacancy 2");

        Observer firstObserver = new Subscriber("name 1");
        Observer secondObserver = new Subscriber("name 2");

        jobSite.addObserver(firstObserver);
        jobSite.addObserver(secondObserver);

        jobSite.addVacancy("vacancy 3");

        jobSite.removeVacancy("vacancy 2");

    }
}
