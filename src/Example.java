import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Example.Menu();
    }
    private static Scanner scanner = new Scanner(System.in);
    private static int userInput;

    public static void Menu() {
        System.out.println("""
                1. Phone Book
                2. Message
                3. Tools
                """);
        System.out.println("pick an option to proceed");
         userInput = scanner.nextInt();
        switch (userInput) {
            case 1 -> {
                System.out.println("This is my phoneBook");
            }
            case 2 -> message();
        }
    }

    public static void message(){
        System.out.println("""
                1. Inbox
                2. Contact
                3.OutBox
                4. Go Back To Main Menu
                5. Exit The App
                
                """);
        System.out.println("pick an option");
         userInput = scanner.nextInt();

        switch (userInput){
            case 4-> Menu();
            case 5 ->{
                System.out.println("Thank you for using our phone");
                System.exit(2);
            }
        }
    }
}
