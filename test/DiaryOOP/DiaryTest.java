package DiaryOOP;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {

    Diary myDiary = new Diary();


     @BeforeEach
    public void canEntryBeCreated(){

      myDiary.createEntryFor("meditate", "The lord is my shepherd");
     }

     @Test
     public void entriesCanBeCounted(){
         assertEquals(1, myDiary.getEntryNumber());
     }

     @Test
     public void viewEntry(){
         String expected= """
                 Title: meditate
                 
                 Body: The lord is my shepherd
                 
                 id: 1
                 """;
         assertEquals(expected, myDiary.findMyEntry(1).toString());
     }
     @Test
     public void countEntries(){
         myDiary.removeMyEntry(1);
         assertEquals(0,myDiary.countMyEntries());
     }

     @Test
    public void entryCanBeDeleted(){
        assertEquals(1,myDiary.countMyEntries());
     }

}