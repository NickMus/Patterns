package Command;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        Command turnOn = new TurnOnLightCommand(light);
        Command turnOff = new TurnOffLightCommand(light);

        Switcher switcher = new Switcher(turnOn, turnOff);
        switcher.turnOn();
        switcher.turnOff();
    }
}
