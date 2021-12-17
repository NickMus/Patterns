package Factory;

public class Renault implements Transport{
    @Override
    public void createCar() {
        System.out.println("Create Renault");
    }
}
