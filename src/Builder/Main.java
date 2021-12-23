package Builder;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .withCarType("sedan")
                .withCarEngine("petrol")
                .withAirConditioner("yes")
                .withAudioSystem("yes")
                .withTriComputer("none")
                .build();


    }
}
