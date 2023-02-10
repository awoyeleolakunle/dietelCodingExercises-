package PhoneBookOOP;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    PhoneBook myPhoneBook = new PhoneBook();

    @BeforeEach
    public void checkIfMyPhoneBookContainsContact(){
        myPhoneBook.addContact("Blessing", "012345");
        myPhoneBook.addContact("James", "12345");
    }

    @Test
    public void countMyContactsTest(){
        assertEquals(1,myPhoneBook.getTotalOfMyContact());
    }

    @Test

    public void viewMyContactTest(){
        String expected = """
                Name: James
                PhoneNumber: 12345
                """;
        assertEquals(expected,myPhoneBook.findMyContact("12345"));
    }
    @Test
    public void countTotalNumberOfContactTest(){
        assertEquals(2,myPhoneBook.getTotalNumberOfContact());
    }
    @Test
    public void showContactHasBeenDeletedTest(){
        //myPhoneBook.viewMyContact("12345");
        myPhoneBook.deleteContact("12345");
        assertEquals(1, myPhoneBook.getTotalNumberOfContact());
    }
    @Test
    public void editMyContactNameTest(){
        myPhoneBook.editContactName("12345", "Moyin");
        String expected = """
                Name: Moyin
                PhoneNumber: 12345
                """;
        assertEquals(expected, myPhoneBook.findMyContact("12345"));
    }
    @Test
    public void editMyContactPhoneNumber(){
        myPhoneBook.editContactPhoneNumber("12345","123456");
        String expected = """
                Name: James
                PhoneNumber: 123456
                """;
        assertEquals(expected,myPhoneBook.findMyContact("123456") );
    }
    @Test
    public void validatePhoneNumberTest(){
        myPhoneBook.editContactPhoneNumber("012345", "1234567");
        //myPhoneBook.editContact("1234567","Moyin");
        assertThrows(IllegalArgumentException.class,()-> myPhoneBook.editContactName("1234567", "moyin"));
    }
}