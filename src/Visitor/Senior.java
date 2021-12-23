package Visitor;

public class Senior implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("senior create class");
    }

    @Override
    public void create(Database database) {
        System.out.println("senior create DB");
    }
}
