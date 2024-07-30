// Invoker class
public class RoverControl {
    private final Command command;

    public RoverControl(Command command) {
        this.command = command;
    }

    public void pressButton(MarsRover rover) {
        command.execute(rover);
    }
}
