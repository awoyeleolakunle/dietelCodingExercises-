package DiaryOOP;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {

        private Entry myEntry;
    @BeforeEach
    public void setMyEntry() {
        myEntry = new Entry("meditation", "I think alot about what the Lord has Done" ,1);
    }

    @Test
    public void checkForEntry(){
        assertNotNull(myEntry);
    }
    @Test
    public void checkMyEntryTitleTest(){
        myEntry.setTitle("Meditation");
        assertSame("Meditation",myEntry.getTitle());

    }
    @Test
    public void CheckMyEntryBodyTest(){

        String body = "I think alot about what the Lord has Done";
        myEntry.setBody(body);
        assertSame(body, myEntry.getBody());
    }
    @Test

    public void checkIfMyIdIsCorrect(){
        myEntry.setId(123);
        assertEquals(123,myEntry.getId());
    }


}