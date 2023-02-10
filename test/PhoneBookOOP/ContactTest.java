package PhoneBookOOP;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {
    private Contact myContact;

    @BeforeEach
    public void testSetUpMyContact() {
        myContact = new Contact(" Moyin Blessing", "012345");
    }


        @Test
    public void testCheckForContact(){
        assertNotNull(myContact);
        }

        @Test
    public void setMyContactName(){
        myContact.setName("Moyin Blessing");
        assertSame("Moyin Blessing", myContact.getName());
        }

        @Test
    public void checkMyContactPhoneNumber(){
        myContact.setPhoneNumber("012345");
        assertSame("012345", myContact.getPhoneNumber());
        }




}