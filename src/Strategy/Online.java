package Strategy;

public class Online implements Status{
    @Override
    public void change() {
        System.out.println("online");
    }
}
