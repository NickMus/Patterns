package Bridge;

public abstract class Car {
    public Color color;

    public Car(Color color) {
        this.color = color;
    }

    public abstract void manufacturing();
}
