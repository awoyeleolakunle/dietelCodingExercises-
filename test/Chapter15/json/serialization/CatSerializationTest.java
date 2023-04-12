package Chapter15.json.serialization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class CatSerializationTest {

       private Cat cat;
       private LocalDateTime dateOfBirth = LocalDateTime.now().minusYears(20);
       private DateTimeFormatter formatter;
    @BeforeEach

    public void setUu(){

       // cat = new Cat("Tom", 20, LocalDateTime.now().minusYears(20));
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        cat = new  Cat();
        cat.setAge(20);
        cat.setName("Tom");
        cat.setDateOfBirth(dateOfBirth);
    }

    @Test
    public void testConvertCatToJson(){
        String catJson = CatSerialization.convertCatToJson(cat);
        System.out.println(catJson);
        assertNotNull(catJson);
       // assertTrue(catJson.equals("{\"name\":\"Tom\",\"age\":20}"));
        assertEquals("{\"name\":\"Tom\",\"age\":20,\"dateOfBirth\":"+"\""+ formatter.format(dateOfBirth)+"\""+"}", catJson);
    }
}