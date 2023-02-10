package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ClockTest {

    @Test
public void testClock() {
        Clock agogo = new Clock(02, 45, 15);
        assertNotNull(agogo);

    }
    @Test
    public void testInitializationOfAttributes(){
        Clock agogo = new Clock(02, 45, 15);
        //agogo.SetHours(02);
        agogo.getHours();
        //agogo.setMinutes(45);
        agogo.getMinutes();
        //agogo.setSeconds(15);
        agogo.getSeconds();
        assertEquals(02, agogo.getHours());
        assertEquals(45, agogo.getMinutes() );
        assertEquals(15, agogo.getSeconds());
    }


    }

