package PhoneBookOOP;

import javax.swing.*;
import java.time.LocalDateTime;
import java.util.Arrays;

public class PhonebookMain {
    private static final PhoneBook phoneContact = new PhoneBook();
    private static final LocalDateTime dateTime = LocalDateTime.now();
    public  static void main(String[] args) {
        showPhoneContact();

    }

    private static void showPhoneContact() {
        String phoneContactMenu = "   " + dateTime + "\n" + """
                =================================
                1. Add Contact
                2. View Contact
                3. Delete Contact
                4. Update/Edit Contact
                5. Check Number of total Contact
                6. Display all contacts
                7. Exit
                =================================
                """;

        String userInput = input(phoneContactMenu);
        if (userInput.equals("")) {
            display("Pick a valid option");
            showPhoneContact();
        }
        switch (userInput.charAt(0)) {
            case '1' -> addContact();
            case '2' -> viewContact();
            case '3' -> deleteContact();
            case '4' -> updateContact();
            case '5' -> checkTotalContact();
            case '6' -> displayAllContact();
            case '7' -> exitPhoneBook();
            default -> {
                display("Pick a valid option");
                showPhoneContact();
            }
        }
    }

    private static void displayAllContact() {

        try {
            for (Contact contact : phoneContact.contactLists) {
                display(contact.toString());
            }
        }
        catch (IllegalArgumentException e){

            display(String.valueOf(e));
        display("no contact");}
        showPhoneContact();
    }

    private static void exitPhoneBook() {
        System.exit(1);
    }

    private static void checkTotalContact() {
        String totalContact = String.format("%s", phoneContact.getTotalNumberOfContact());
        display(totalContact);
        showPhoneContact();

    }

    private static void updateContact() {
        String edit = """
                1. Edit Name
                2. Edit PhoneNumber
                3. ShowMainMenu
                """;

        String editOption = input(edit);
        switch (editOption.charAt(0)) {
            case '1' -> {
                try {
                    String phoneNumber = input("please enter your phone number ");
                    String contactName = input("please enter contact name");
                    phoneContact.editContactName(phoneNumber, contactName);
                    display("Contact name has been successfully updated");
                    updateContact();
                } catch (IllegalArgumentException e) {
                    display(e.getMessage());
                }
                showPhoneContact();
            }
            case '2' -> {
                try{
                    String oldPhoneNumber = input("please enter your existing phone number ");
                    String newPhoneNumber = input("please enter a new phone number");

                    phoneContact.editContactPhoneNumber(oldPhoneNumber, newPhoneNumber);
                    display("Contact phone number has been successfully updated");
                } catch (IllegalArgumentException e) {
                    display(e.getMessage());
                }
                showPhoneContact();
            }
            case '3' -> showPhoneContact();
        }
    }

    private static void deleteContact(){
        try{
        String phoneNumber = input("please enter the phone number of the contact you wish to delete");
        phoneContact.deleteContact(phoneNumber);
        display("Contact has been deleted successfully");
        showPhoneContact();
    }
        catch (IllegalArgumentException e){
        display(e.getMessage());}
        showPhoneContact();
    }


    private static void viewContact() {
        try {
            String phoneNumber = input("enter the phoneNumber of the contact you want to view");
            String viewContact = String.format("%s%n%s", dateTime, phoneContact.viewMyContact(phoneNumber));
            display(viewContact);
            display("Thank you for viewing");
        }
        catch (IllegalArgumentException e){
            display(e.getMessage());
        }
        showPhoneContact();
    }

    private static void addContact() {
        String contactName = input("enter your contact's name");
        String phoneNumber = input("enter phone number you want to save");
        phoneContact.addContact(contactName, phoneNumber);
        display("Your contact has been successfully saved");
        showPhoneContact();
    }

    public static String input(String prompt){
       return JOptionPane.showInputDialog(prompt);
    }
    public static void display(String prompt){
        JOptionPane.showMessageDialog(null,prompt);
    }
}
