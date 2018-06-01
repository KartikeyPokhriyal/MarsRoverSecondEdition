import java.util.Objects;

public class Location {
    private  char direction_on_compass;
    private char left;
    private char right;
    private  int x_coordinate;
    private  int y_coordinate;

    public Location(int x_coordinate, int y_coordinate) {
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
    }

    public Location(int x_coordinate, int y_coordinate, char direction_on_compass) throws IllegalArgumentException {
        if (x_coordinate < 1 || y_coordinate < 1 || x_coordinate > 5 || y_coordinate > 5)
            throw new IllegalArgumentException();
        else {
            this.direction_on_compass = direction_on_compass;
            this.x_coordinate = x_coordinate;
            this.y_coordinate = y_coordinate;
        }
    }

    public Location(char direction_on_compass) {
        this.direction_on_compass = direction_on_compass;
    }

    public static Location north() {
        return new Location('N');
    }

    public static Location east() {
        return new Location('E');
    }

    public static Location west() {
        return new Location('W');
    }

    public static Location south() {
        return new Location('S');
    }


    public  Location turnByNinetyDegree(char right) {

        if(right == 'R') {
            if (direction_on_compass == 'N')
                return new Location(x_coordinate, y_coordinate,'E');
            if(direction_on_compass == 'S')
                return new Location(x_coordinate, y_coordinate, 'W');
            if(direction_on_compass == 'E')
                return new Location(x_coordinate, y_coordinate,'S');
            if(direction_on_compass == 'W')
                return new Location(x_coordinate, y_coordinate, 'N');
        }

        if(right == 'L') {
            if (direction_on_compass == 'N')
                return new Location(x_coordinate, y_coordinate, 'W');
            if(direction_on_compass == 'S')
                return new Location(x_coordinate, y_coordinate,'E');
            if(direction_on_compass == 'E')
                return new Location(x_coordinate, y_coordinate, 'N');
            if(direction_on_compass == 'W')
                return new Location(x_coordinate, y_coordinate, 'S');
        }

        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return direction_on_compass == location.direction_on_compass &&
                left == location.left &&
                right == location.right;
    }

    @Override
    public int hashCode() {

        return Objects.hash(direction_on_compass, left, right);
    }

    public Location move() {
        if(direction_on_compass == 'N')
            return new Location(x_coordinate, y_coordinate + 1, direction_on_compass);

        if(direction_on_compass == 'S')
            return new Location(x_coordinate, y_coordinate - 1, direction_on_compass);

        if(direction_on_compass == 'E')
            return new Location(x_coordinate + 1, y_coordinate , direction_on_compass);

        if(direction_on_compass == 'W')
            return new Location(x_coordinate - 1, y_coordinate + 1, direction_on_compass);

        else return this;
    }

    @Override
    public String toString() {
        return "Location{" +
                "direction_on_compass=" + direction_on_compass +
                ", left=" + left +
                ", right=" + right +
                ", x_coordinate=" + x_coordinate +
                ", y_coordinate=" + y_coordinate +
                '}';
    }
}

