package PhoneBookOOP;

import java.util.ArrayList;

public class PhoneBook {

    ArrayList<Contact> contactLists = new ArrayList<>();

    public void addContact(String name, String phoneNumber) {
        Contact contactList = new Contact(name, phoneNumber);
        contactLists.add(contactList);
    }

    public int getTotalOfMyContact() {
        return contactLists.size();
    }


    public Contact findMyContact(String phoneNumber) {
        //validatePhoneNumber(phoneNumber);
        for (Contact contact : contactLists) {
            if (contact.getPhoneNumber().equals(phoneNumber))
                return contact;
        }
        throw new IllegalArgumentException("You entered a wrong phone Number ");
    }

    public Contact viewMyContact(String phoneNumber) {
        return findMyContact(phoneNumber);
    }

    public int getTotalNumberOfContact() {
        return contactLists.size();
    }

    public void deleteContact(String phoneNumber) {
        validatePhoneNumber(phoneNumber);
        contactLists.removeIf(contact -> contact.getPhoneNumber().equals(phoneNumber));
    }

    public void editContactName(String phoneNumber, String name) {
        //validatePhoneNumber(phoneNumber);
        for (Contact contact : contactLists) {
            if (contact.getPhoneNumber().equals(phoneNumber))
                contact.setName(name);

        }
    }

    public void editContactPhoneNumber(String oldPhoneNumber, String newPhoneNumber) {
        //validatePhoneNumber(oldPhoneNumber);
        for (Contact contact : contactLists) {
            contact.setPhoneNumber(newPhoneNumber);
        }
    }

    public void validatePhoneNumber(String phoneNumber) {
        for (Contact contact : contactLists) {
            if (!(contact.getPhoneNumber().equals(phoneNumber)))
                throw new IllegalArgumentException("You entered a wrong phone number");
        }
    }

    public Contact showAllContact() {
        for (int i = 0; i < contactLists.size(); i++) {
            return contactLists.get(i);
        }
        return null;
    }

  //  public Contact showAllContacts() {
    //    for (int i = 0; i <contactLists.size() ; i++) {
      //      return contactLists.get(i);
        //}

     //return null;
    //}
}
