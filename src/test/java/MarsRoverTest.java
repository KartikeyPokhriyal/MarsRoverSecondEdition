import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {

    @Test
    public void shouldMoveNinetyDegreeLeftWhenLIsTheCommand() {
        MarsRover marsRover = new MarsRover(1,2,'N');

        assertEquals(new MarsRover(1,2, 'W'), marsRover.follow('L'));
    }

    @Test
    public void shouldMoveNinetyDegreeLeftWhenRIsTheCommand() {
        MarsRover marsRover = new MarsRover(1,2,'W');

        assertEquals(new MarsRover(1,2, 'S'), marsRover.follow('R'));
    }

}

