import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class MarsRoverTest {


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


    @Test (expected = IllegalArgumentException.class)
    public void roverCannotTraverseBeyondThePlateau() {
        Location loaction = new Location(6, 0, 'N');
    }

    @Test
    public void leftOfNorthIsWest() {

        Location location = new Location(1,2,'N');

        assertEquals(new Location(1,2,'W'), location.north('L'));
    }

    @Test
    public void leftOfSouthIsEast() {

        Location location = new Location(1,2,'S');

        assertEquals(new Location(1,2,'E'), location.south('L'));
    }

    @Test
    public void rightOfWestIsNorth() {

        Location location = new Location(1,2,'W');

        assertEquals(new Location(1,2,'N'), location.west('R'));
    }

    @Test
    public void rightOfEastIsSouth() {

        Location location = new Location(1,2,'E');

        assertEquals(new Location(1,2,'S'), location.east('R'));
    }

}

