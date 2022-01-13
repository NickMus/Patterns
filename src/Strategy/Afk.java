package Strategy;

public class Afk implements Status{
    @Override
    public void change() {
        System.out.println("out of keyboard");
    }
}
