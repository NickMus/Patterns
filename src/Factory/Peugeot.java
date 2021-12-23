package Factory;

public class Peugeot implements Transport{
    @Override
    public void createCar() {
        System.out.println("Create Peugeot");
    }
}
