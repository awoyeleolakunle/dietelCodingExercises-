package DiaryOOP;

import javax.swing.*;
import java.time.LocalDateTime;
import java.util.Scanner;

public class DiaryMain {
    private static final LocalDateTime dateTime = LocalDateTime.now();
    private static final Diary myDiary = new Diary();

    public static void main(String[] args) {
        showDiary();
    }
    private static void showDiary(){

        String diaryMenu  = "   "+ dateTime +"\n" + """
                =================================
                1. Create Entry
                2. View Entry
                3. Delete Entry
                4. Update/Edit Entry
                5. Check Number of total Entries
                6. Exit
                =================================
                """;

        String userInput = input(diaryMenu);
        if (userInput.equals("")){
            display("Pick a valid option");
        showDiary();}

        switch (userInput.charAt(0)) {
            case '1' -> createEntry();
            case '2' -> viewEntry();
            case '3' -> deleteEntry();
            case '4' -> updateEntry();
            case '5' -> checkTotalEntry();
            case '6' -> exitDairy();
            default -> {
             display("Pick a valid option");
            showDiary();
        }
        }
    }

    private static void exitDairy() {
        display("Thank you for using our app");
        System.exit(0);

    }

    private static void checkTotalEntry() {
       String totalEntry = String.format( "%s", myDiary.getEntryNumber());
       display(totalEntry);
       showDiary();
    }

    private static void updateEntry() {
        try {
            int id = Integer.parseInt(input("please enter the id of the entry you wish to update "));
            String titleUpdate = input("enter your updated entry title");
            String bodyUpdate = input(" edit your entry body ");
            String update = String.format("%s%n%s", dateTime, myDiary.updateEntry(id, titleUpdate, bodyUpdate));
            display("entry successfully updated");
            display(update);
        } catch (IllegalArgumentException e) {
            display(e.getMessage());
        }

        display("Thank you for viewing");
        showDiary();
    }

    private static void deleteEntry() {
        try{
        int id = Integer.parseInt(input("please enter the id of the entry you wish to delete"));
        String entryView =String.format( "%s%n%s",dateTime, myDiary.viewEntry(id));
        display(entryView);

            myDiary.removeMyEntry(id);
            display("Entry successfully deleted");
        }
        catch (IllegalArgumentException e){
            display( e.getMessage());}

        showDiary();

    }

    private static void viewEntry() {
        try {

            int id = Integer.parseInt(input("Please enter the Id you want to view "));
            String entryView = String.format("%s%n%s", dateTime, myDiary.viewEntry(id));
            display(entryView);
            display("Thank you for viewing");
        }
        catch (IllegalArgumentException e){
            display(e.getMessage());
        }
        showDiary();

    }

    private static void createEntry() {
        String title = input(" Enter your entry title ");
        String body = input("please enter the content of your entry");
        myDiary.createEntryFor(title, body);
        display("Entry has been created successfully on " + dateTime );
        showDiary();

    }

    private static String input(String prompt){
        return JOptionPane.showInputDialog(prompt);
    }
    private static void display(String prompt){
        JOptionPane.showMessageDialog(null, prompt);
    }
}
