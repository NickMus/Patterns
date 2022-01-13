package Strategy;

public class Offline implements Status{
    @Override
    public void change() {
        System.out.println("offline");
    }
}
