// Receiver class: Mars Rover

import java.util.HashSet;
import java.util.Set;

public class MarsRover {
    private int x;
    private int y;
    private Direction direction;
    private Grid grid;
    private Set<String> waypoints = new HashSet<>();

    public MarsRover(int x, int y, Direction direction, Grid grid) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.grid = grid;
    }

    public void move() {
        int newX = x;
        int newY = y;

        switch (direction) {
            case NORTH:
                newY++;
                break;
            case EAST:
                newX++;
                break;
            case SOUTH:
                newY--;
                break;
            case WEST:
                newX--;
                break;
        }

        if (grid.isWithinBounds(newX, newY) && !grid.isObstacle(newX, newY)) {
            x = newX;
            y = newY;
            checkWaypoints();
        }
    }

    public void turnLeft() {
        direction = Direction.values()[(direction.ordinal() + 3) % 4];
    }

    public void turnRight() {
        direction = Direction.values()[(direction.ordinal() + 1) % 4];
    }

    public void addWaypoint(int x, int y) {
        waypoints.add(x + "," + y);
    }

    private void checkWaypoints() {
        if (waypoints.contains(x + "," + y)) {
            System.out.println("Reached waypoint at (" + x + ", " + y + ")");
            waypoints.remove(x + "," + y);
        }
    }

    public String getStatus() {
        return String.format("Rover is at (%d, %d) facing %s. %d Obstacles detected.", x, y, direction,
                grid.getObstacleCount());
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void printGrid() {
        grid.printGrid(this);
    }
}
