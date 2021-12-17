package Decorator;

public class EngineRepair implements Service {
    private double price;
    private String label;

    public EngineRepair(double price, String label) {
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
