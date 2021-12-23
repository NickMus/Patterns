package Builder;

public class Car {
    private String carType;
    private String engine;
    private String airConditioner;
    private String tripComputer;
    private String audioSystem;

    public static class Builder {
        private Car newCar;

        public Builder() {
            newCar = new Car();
        }
        public Builder withCarType(String carType) {
            newCar.carType = carType;
            return this;
        }
        public Builder withCarEngine(String engine) {
            newCar.engine = engine;
            return this;
        }
        public Builder withAirConditioner(String airConditioner) {
            newCar.airConditioner = airConditioner;
            return this;
        }
        public Builder withTriComputer(String triComputer) {
            newCar.tripComputer = triComputer;
            return this;
        }
        public Builder withAudioSystem(String audioSystem) {
            newCar.audioSystem = audioSystem;
            return this;
        }
        public Car build() {
            return newCar;
        }
    }
}
