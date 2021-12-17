package Decorator;

public class CarWashing implements Service {
    private double price;
    private String label;

    public CarWashing(double price, String label) {
        this.price = price;
        this.label = label;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String label() {
        return this.label;
    }
}
