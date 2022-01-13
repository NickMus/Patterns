package Decorator;

public class Repair extends ServiceDecarator {

    public Repair(Service service) {
        super(service, 5000, "токарные работы");
    }
}
