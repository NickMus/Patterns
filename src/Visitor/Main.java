package Visitor;

public class Main {
    public static void main(String[] args) {
        Project project = new Project();
        Developer junior = new Junior();
        Developer senior = new Senior();

        project.beWritten(junior);
        project.beWritten(senior);

    }
}
