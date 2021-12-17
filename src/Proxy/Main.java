package Proxy;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(new CarAccess());
        car.closeCar("1234");
    }
}
