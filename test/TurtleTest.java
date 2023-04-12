import TurTle.Position;
import TurTle.Turtle;
import org.junit.jupiter.api.Test;

import static TurTle.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {

    private Turtle ijapa = new Turtle();

    @Test

    public void TurtleCanMovePenDownTest() {
        //   Turtle ijapa = new Turtle();
        assertTrue(ijapa.penIsUp());
        ijapa.penDown();
        assertFalse(ijapa.penIsUp());
    }

    @Test
    public void TurtleCanMovePenUpTest() {
        //Turtle ijapa = new Turtle();
        ijapa.penDown();
        assertFalse(ijapa.penIsUp());

        ijapa.penUp();
        assertTrue(ijapa.penIsUp());
    }

    @Test
    public void turtleCanTurnRightWhileFacingEastTest() {

        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightWhileFacingSouthTest() {
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());

        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnRightWhileFacingWestTest() {
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());

    }

    @Test
    public void turtleCanTurnLeftWhileFacingEastTest(){
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightWhileFacingNorthTest() {
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(EAST, ijapa.getCurrentDirection());
    }
        //TODO add turn left for east, west and south

    @Test
public void turtleCanMoveForwardWhileFacingEastTest() {
    assertSame(EAST, ijapa.getCurrentDirection());
    assertEquals(new Position(0,0),ijapa.getPosition());
    ijapa.moveForward(5);
    assertEquals(new Position(0,5),ijapa.getPosition());
    }
}
