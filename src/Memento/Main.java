package Memento;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        Repo repo = new Repo();

        System.out.println("create project ver 1.0");
        project.setVersionAndDate("ver 1.0");
        System.out.println(project);
        repo.setSaver(project.saver());
        System.out.println("creating ver 1.1");
        Thread.sleep(2000);
        project.setVersionAndDate("ver 1.1");
        System.out.println(project);
        System.out.println("return to 1.0");
        project.load(repo.getSaver());
        System.out.println(project);
    }
}
