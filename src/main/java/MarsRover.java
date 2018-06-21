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

            switch (location.direction_on_compass) {

                case 'N':
                  return new MarsRover(location.north(aCommand));


                case 'S':
                    return new MarsRover(location.south(aCommand));


                case 'E':
                    return new MarsRover(location.east(aCommand));


                case 'W':
                    return new MarsRover(location.west(aCommand));

            }
        }
        return this;
    }

    @Override
    public String toString() {
        return "MarsRover{" +
                "location=" + location +
                '}';
    }
}