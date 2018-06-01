import java.util.Objects;

public class MarsRover {
    public Location location;

    public MarsRover(Location location) {
        this.location = location;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MarsRover)) return false;
        MarsRover marsRover = (MarsRover) o;
        return Objects.equals(location, marsRover.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location);
    }

    public MarsRover follow(String commands) {
        char[] command = commands.toCharArray();


        for (char aCommand : command) {


            if (aCommand == 'R' || aCommand == 'L')
                location = location.turnByNinetyDegree(aCommand);

            else {
                location = location.move();
            }
        }
        return new MarsRover(location);
    }

    @Override
    public String toString() {
        return "MarsRover{" +
                "location=" + location +
                '}';
    }
}