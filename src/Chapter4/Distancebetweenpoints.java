package Chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Distancebetweenpoints {
    @Test
    public void testThatTwoPointsInAPlaneRestOnLinePerpendicularToAxis(){
        assertTrue(DistanceExercise.isPerpendicular( 2, 2,4, 5 ));
    }
    @Test
    public void testThatCoordinateWith(){

    }
}
