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

    public MarsRover follow(String commands) throws CommandNotFoundException{
        char[] command = commands.toCharArray();

        for (char instruction : command) {

            if(instruction != 'M' || instruction!= 'L' || instruction!= 'R') {

                throw new CommandNotFoundException();
            }

            else {
                switch (location.direction_on_compass) {

                    case 'N':
                        location.north(instruction);


                    case 'S':
                        location.south(instruction);


                    case 'E':
                        location.east(instruction);


                    case 'W':
                        location.west(instruction);

                }
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