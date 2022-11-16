package Chapter4;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput = inputCollector.nextInt();
        if (userInput > 10) {
            System.out.print("Out of range ");
        }
        else {if (userInput %2 == 0)
            System.out.println("This is even");
            else {
                System.out.println("This is odd biko");
        }
        }
    }
}
