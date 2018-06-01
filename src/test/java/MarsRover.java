import java.util.Objects;

public class MarsRover {
    private int x_coordinate;
    private int y_coordinate;
    private char direction;

    public MarsRover(int x_coordinate, int y_coordinate, char direction) {
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
        this.direction = direction;
    }

    public char getDirection() {
        return direction;
    }

    public MarsRover follow(char command) {

            if((getDirection() == 'E' && command == 'L')  || (getDirection() == 'W' && command == 'R'))
            return new MarsRover(x_coordinate, y_coordinate,'N');

            else return  this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MarsRover)) return false;
        MarsRover marsRover = (MarsRover) o;
        return x_coordinate == marsRover.x_coordinate &&
                y_coordinate == marsRover.y_coordinate &&
                direction == marsRover.direction;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x_coordinate, y_coordinate, direction);
    }

    @Override
    public String toString() {
        return "MarsRover{" +
                "x_coordinate=" + x_coordinate +
                ", y_coordinate=" + y_coordinate +
                ", direction=" + direction +
                '}';
    }
}
