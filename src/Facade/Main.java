package Facade;

public class Main {
    public static void main(String[] args) {
        CarFacade car = new CarFacade(new Car());
        car.startEngine();
        car.stopEngine();
    }
}
