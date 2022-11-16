package ac;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AcTest {
    @Test
    void checkAcIsOn(){
        Ac lg = new Ac();
        assertFalse(lg.isOn());

        lg.turnOn();
        assertTrue(lg.isOn());

    }
}
