public class MarsRoverSimulation {
    public static void main(String[] args) {
        // Initialize grid and rover
        Grid grid = new Grid(10, 10);
        grid.addObstacle(2, 2);
        grid.addObstacle(3, 5);

        MarsRover rover = new MarsRover(0, 0, Direction.NORTH, grid);

        // Add waypoints
        rover.addWaypoint(1, 2);
        rover.addWaypoint(1, 3);

        // Print initial grid
        System.out.println("Initial Grid:");
        rover.printGrid();
        System.out.println();

        // Command sequence
        Command move = new MoveCommand();
        Command turnLeft = new TurnLeftCommand();
        Command turnRight = new TurnRightCommand();

        RoverControl control;

        // Execute commands
        control = new RoverControl(move);
        control.pressButton(rover); // Move to (0, 1)
        control.pressButton(rover); // Move to (0, 2)

        control = new RoverControl(turnRight);
        control.pressButton(rover); // Turn to East

        control = new RoverControl(move);
        control.pressButton(rover); // Move to (1, 2)

        control = new RoverControl(turnLeft);
        control.pressButton(rover); // Turn to North

        control = new RoverControl(move);
        control.pressButton(rover); // Move to (1, 3)

        // Print final grid
        System.out.println("Final Grid:");
        rover.printGrid();

        // Print final status
        System.out.println(rover.getStatus());
    }
}
