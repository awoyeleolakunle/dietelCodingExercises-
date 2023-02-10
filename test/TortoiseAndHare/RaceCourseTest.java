package TortoiseAndHare;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RaceCourseTest {
    private RaceCourse raceCourse;
    @BeforeEach
    void setUp(){
        raceCourse = new RaceCourse();
    }
    @Test
    public void testThatRaceCourseExists(){
        assertNotNull(raceCourse);
    }
    @Test
    public void testThatRaceCourseHasRaceTract(){
        assertNotNull(raceCourse);
        assertNotNull(raceCourse.getRaceTracks());
    }
    public void testThatRaxeCourseHasPail(){
        assertNotNull(raceCourse);
        assertNotNull(raceCourse.getPail());

    }

}