package TortoiseAndHare;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RaceTracksTest {
    private RaceTracks raceTracks;
    @BeforeEach
    public void setUp(){
        raceTracks = new RaceTracks();
    }
    @Test
    public void testThatRaceTrackExists(){
        assertNotNull(raceTracks);
    }
    @Test
    public void testThatRaceTrackHasSeventySquares(){
        String [][] lanes = raceTracks.getLane();
        String [] laneOne = lanes[0];
            String [] lanesTwo = lanes[1];
        assertEquals(70,lanes[0].length);
        assertEquals(70,lanes[1].length);
    }
    @Test
    public void testThatRaaceTrackLaneSquareIsBlankDefault() {
        String[][] lanes = raceTracks.getLane();

    }
}