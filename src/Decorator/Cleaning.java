package Decorator;

public class Cleaning extends ServiceDecarator {

    public Cleaning(Service service) {
        super(service, 1000, "хичистка");
    }
}
