package Decorator;

public class ServiceDecarator implements Service {
    private Service service;
    private double price;
    private String label;

    public ServiceDecarator(Service service, double price, String label) {
        this.service = service;
        this.price = price;
        this.label = label;
    }

    @Override
    public double getPrice() {
        return this.price + service.getPrice();
    }

    @Override
    public String label() {
        return this.label + service.label();
    }
}
