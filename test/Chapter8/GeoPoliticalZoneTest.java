package Chapter8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeoPoliticalZoneTest {

    @Test
    public void geoPoliticalZoneTest() {
        GeoPoliticalZone zone = GeoPoliticalZone.geopoliticalZone("Akwa Ibom");
        assertEquals(GeoPoliticalZone.SOUTHSOUTH, zone);

    }
}