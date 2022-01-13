package Proxy;

public class Car {
    private CarAccess carAccess;

    public Car(CarAccess carAccess) {
        this.carAccess = carAccess;
    }

    public void openCar(String password) {
        if (password == makePass()) {
            carAccess.openCar();
        } else {
            System.out.println("Invalid password");
        }
    }

    public void closeCar(String password) {
        if (password == makePass()) {
            carAccess.closeCar();
        } else {
            System.out.println("Invalid password");
        }

    }

    public String makePass() {
        return "1234";
    }
}
