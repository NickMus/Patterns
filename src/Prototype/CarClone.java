package Prototype;

public class CarClone implements Cloneable {
    private String name;
    private Car car;

    public CarClone(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        CarClone clone = (CarClone) super.clone();
        return clone;
    }
}
