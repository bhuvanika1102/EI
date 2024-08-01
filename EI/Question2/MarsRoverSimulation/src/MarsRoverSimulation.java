import java.util.Scanner;

public class MarsRoverSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get grid size
        System.out.println("Enter grid width:");
        int width = scanner.nextInt();
        System.out.println("Enter grid height:");
        int height = scanner.nextInt();

        Grid grid = new Grid(width, height);

        // Get obstacles
        System.out.println("Enter number of obstacles:");
        int numObstacles = scanner.nextInt();
        for (int i = 0; i < numObstacles; i++) {
            System.out.println("Enter obstacle coordinates (x y):");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            grid.addObstacle(x, y);
        }

        // Get rover starting position
        System.out.println("Enter rover starting position (x y direction):");
        int startX = scanner.nextInt();
        int startY = scanner.nextInt();
        String dir = scanner.next();
        Direction direction;
        switch (dir.toUpperCase()) {
            case "N":
                direction = Direction.NORTH;
                break;
            case "E":
                direction = Direction.EAST;
                break;
            case "S":
                direction = Direction.SOUTH;
                break;
            case "W":
                direction = Direction.WEST;
                break;
            default:
                System.out.println("Invalid direction, defaulting to NORTH");
                direction = Direction.NORTH;
                break;
        }
        MarsRover rover = new MarsRover(startX, startY, direction, grid);

        // Get waypoints
        System.out.println("Enter number of waypoints:");
        int numWaypoints = scanner.nextInt();
        for (int i = 0; i < numWaypoints; i++) {
            System.out.println("Enter waypoint coordinates (x y):");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            rover.addWaypoint(x, y);
        }

        // Print initial grid
        System.out.println("Initial Grid:");
        rover.printGrid();
        System.out.println();

        // Execute commands
        System.out.println("Enter commands (M for move, L for turn left, R for turn right):");
        scanner.nextLine(); // Consume newline
        String commands = scanner.nextLine();

        Command move = new MoveCommand();
        Command turnLeft = new TurnLeftCommand();
        Command turnRight = new TurnRightCommand();

        RoverControl control;

        for (char command : commands.toCharArray()) {
            switch (command) {
                case 'M':
                    control = new RoverControl(move);
                    control.pressButton(rover);
                    break;
                case 'L':
                    control = new RoverControl(turnLeft);
                    control.pressButton(rover);
                    break;
                case 'R':
                    control = new RoverControl(turnRight);
                    control.pressButton(rover);
                    break;
                default:
                    System.out.println("Invalid command: " + command);
            }
        }

        // Print final grid
        System.out.println("Final Grid:");
        rover.printGrid();

        // Print final status
        System.out.println(rover.getStatus());

        scanner.close();
    }
}
