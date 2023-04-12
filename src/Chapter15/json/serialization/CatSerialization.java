package Chapter15.json.serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CatSerialization {

    public static String convertCatToJson(Cat cat) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(cat);
        } catch (JsonProcessingException e) {
         return e.getMessage();
        }
    }
}
