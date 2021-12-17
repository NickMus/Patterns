package Bridge;

public class Lada extends Car {
    public Lada(Color color) {
        super(color);
    }

    @Override
    public void manufacturing() {
        System.out.println("Manufacturing LADA");
        color.paint();
    }
}
