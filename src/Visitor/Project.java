package Visitor;

public class Project implements ProjectElement{

    ProjectElement[] projectElements;

    public Project() {
        this.projectElements = new ProjectElement[] {
                new ProjectClass(),
                new Database()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for (ProjectElement p : projectElements) {
            p.beWritten(developer);
        }
    }
}
