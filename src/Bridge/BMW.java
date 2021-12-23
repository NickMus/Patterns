package Bridge;

public class BMW extends Car {
    public BMW(Color color) {
        super(color);
    }

    @Override
    public void manufacturing() {
        System.out.println("Manufacturing BMW");
        color.paint();
    }
}
