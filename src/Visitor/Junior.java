package Visitor;

public class Junior implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("junior create class");
    }

    @Override
    public void create(Database database) {
        System.out.println("junior create DB");
    }
}
