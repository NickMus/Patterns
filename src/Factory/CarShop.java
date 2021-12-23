package Factory;

public class CarShop {
    private final Factory factory;

    public CarShop(Factory factory) {
        this.factory = factory;
    }
    public Transport orderCar(Brand brand) {

        Transport transport = factory.createCar(brand);
        return transport;
    }
}
