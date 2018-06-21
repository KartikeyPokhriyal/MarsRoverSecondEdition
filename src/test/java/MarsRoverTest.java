import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class MarsRoverTest {

    @Test
    public void roverShouldChangeDirections() {
        MarsRover rover = new MarsRover(new Location(1,2,'N'));

        assertEquals(new MarsRover(new Location('W')), rover.follow("L"));
    }

    @Test
    public void roverShouldChangeCoordinates() {
        MarsRover rover = new MarsRover(new Location(1,2,'N'));

        assertEquals(new MarsRover(new Location(1,3,'N')), rover.follow("M"));
    }

    @Test
    public void roverShouldChangeCoordinateAndDirections() {
        MarsRover rover = new MarsRover(new Location(1,2,'N'));

        assertEquals(new MarsRover(new Location(1,3,'N')), rover.follow("MLRL"));
    }

    @Test (expected = CommandNotFoundException.class)
    public void roverShouldNotAcceptInvalidCommands() {
        MarsRover rover = new MarsRover(new Location(1,2,'N'));

        rover.follow("LFGH");
    }

}

