package Chapter5;

import java.security.SecureRandom;
import java.util.Scanner;

public class BarChatPrinting {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter first number ");
        int firstNumber = scanner.nextInt();
        System.out.println("enter second number");
        int secondNumber = scanner.nextInt();
        System.out.println("enter third number");
        int thirdNumber = scanner.nextInt();
        System.out.println("enter fourth number");
        int fourthNumber = scanner.nextInt();
        System.out.println("enter fifth Number");
        int fifthNumber = scanner.nextInt();

        for (int i = 0; i <firstNumber ; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i <secondNumber ; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i <thirdNumber ; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i <fourthNumber ; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i <fifthNumber ; i++) {
            System.out.print("*");
        }
    
    }
}