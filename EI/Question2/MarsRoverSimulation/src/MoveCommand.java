import java.util.logging.Logger;

// Concrete Command to move the rover
public class MoveCommand implements Command {
    private static final Logger logger = Logger.getLogger(MoveCommand.class.getName());

    @Override
    public void execute(MarsRover rover) {
        rover.move();
        logger.info("Executed MoveCommand: Rover moved to (" + rover.getX() + ", " + rover.getY() + ")");
    }
}
