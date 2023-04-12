package Chapter15.json.deserialization;

import Chapter15.json.serialization.Cat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class CatDeserializerTest {
    private Cat cat = new Cat();
   private String catJson;
   private DateTimeFormatter formatter;
   private final LocalDateTime dateOfBirth = LocalDateTime.now().minusYears(20);

    @BeforeEach
    void setUp(){
        cat.setDateOfBirth(dateOfBirth);
        catJson = "{\"name\":\"Morenike\",\"age\":30}";
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-dd");
    }

    @Test
    void deserialiseJsonToCat(){
        Cat ologbo = CatDeserializer.deserializeJsonToCat(catJson);
        assertNotNull(ologbo);
    }
    @Test
    public void testDeserializeJsonToCat(){
        String catJson = "{\"name\":\"Morenike\",\"age\":30,\"dateOfBirth\":"+"\""+formatter.format(dateOfBirth)+"\""+"}";
        Cat ologbo = CatDeserializer.deserializeJsonToCat(catJson);
        assertNotNull(ologbo);
        assertEquals("Morenike", ologbo.getName());
    }


}