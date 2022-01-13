package Command;

public class Switcher {
    private Command turnOnLightCommand;
    private Command turnOffLightCommand;

    public Switcher(Command turnOnLightCommand, Command turnOffLightCommand) {
        this.turnOnLightCommand = turnOnLightCommand;
        this.turnOffLightCommand = turnOffLightCommand;
    }
    public void turnOn() {
        turnOnLightCommand.execute();
    }
    public void turnOff() {
        turnOffLightCommand.execute();
    }
}
