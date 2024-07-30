import java.util.HashMap;
import java.util.Map;

// Composite Pattern to represent the Grid
public class Grid {
    private final int width;
    private final int height;
    private final Map<String, Boolean> obstacles = new HashMap<>();

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void addObstacle(int x, int y) {
        obstacles.put(x + "," + y, true);
    }

    public boolean isWithinBounds(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }

    public boolean isObstacle(int x, int y) {
        return obstacles.containsKey(x + "," + y);
    }

    public int getObstacleCount() {
        return obstacles.size();
    }

    public void printGrid(MarsRover rover) {
        for (int y = height - 1; y >= 0; y--) {
            for (int x = 0; x < width; x++) {
                if (rover.getX() == x && rover.getY() == y) {
                    System.out.print(getRoverSymbol(rover.getDirection()) + " ");
                } else if (isObstacle(x, y)) {
                    System.out.print("X ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    private char getRoverSymbol(Direction direction) {
        switch (direction) {
            case NORTH:
                return '^';
            case EAST:
                return '>';
            case SOUTH:
                return 'v';
            case WEST:
                return '<';
            default:
                return '?';
        }
    }
}
