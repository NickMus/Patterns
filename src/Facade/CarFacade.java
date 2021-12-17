package Facade;

public class CarFacade {
    private Car car;

    public CarFacade(Car car) {
        this.car = car;
    }

    public void startEngine() {
        car.turnOnIgnition();
        car.turnOnFuelPump();
        car.spinStarter();
        car.makeSparkOnPlugs();
        car.engineWorking();
    }
    public void stopEngine() {
        car.makeOffSparkOnPlugs();
        car.engineStopping();
        car.turnOffFuelPump();
        car.turnOffIgnition();
    }
}
