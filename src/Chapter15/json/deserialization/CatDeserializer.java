package Chapter15.json.deserialization;

import Chapter15.json.serialization.Cat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.ObjectOutputStream;

public class CatDeserializer {

    public static Cat deserializeJsonToCat(String json) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(json.getBytes(), Cat.class);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
