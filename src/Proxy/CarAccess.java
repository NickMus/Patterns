package Proxy;

public class CarAccess implements SecuritySystem {
    @Override
    public void openCar() {
        System.out.println("Car is opening");
    }

    @Override
    public void closeCar() {
        System.out.println("Car is closing");
    }
}
