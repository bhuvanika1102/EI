import java.util.logging.Logger;

// Concrete Command to turn the rover right
public class TurnRightCommand implements Command {
    private static final Logger logger = Logger.getLogger(TurnRightCommand.class.getName());

    @Override
    public void execute(MarsRover rover) {
        rover.turnRight();
        logger.info("Executed TurnRightCommand: Rover turned right, now facing " + rover.getDirection());
    }
}
