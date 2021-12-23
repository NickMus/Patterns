package Factory;

public class Citroen implements Transport{
    @Override
    public void createCar() {
        System.out.println("Create Citroen");
    }
}
