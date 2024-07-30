import java.util.logging.Logger;

// Concrete Command to turn the rover left
public class TurnLeftCommand implements Command {
    private static final Logger logger = Logger.getLogger(TurnLeftCommand.class.getName());

    @Override
    public void execute(MarsRover rover) {
        rover.turnLeft();
        logger.info("Executed TurnLeftCommand: Rover turned left, now facing " + rover.getDirection());
    }
}
