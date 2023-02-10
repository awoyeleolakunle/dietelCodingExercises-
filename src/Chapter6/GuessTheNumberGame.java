package Chapter6;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    private static Scanner scanner = new Scanner(System.in);
    private static SecureRandom numberToBeGuessed = new SecureRandom();

    public static void main(String[] args) {

       letTheGuessGameBegins();
    }

    private static void numberTobeGuessed() {
        int guessRight = continueGame();
        int playerGuessedNumber = scanner.nextInt();
        if (playerGuessedNumber == guessRight)
            System.out.println("congratulation, you guessed rightly");
        else {
            while (guessRight!=playerGuessedNumber) {
                if (playerGuessedNumber > guessRight) {
                    System.out.println(" That is too high. Try again");
                } else {
                    System.out.println("oh, That is too low. Try again");
                }
                playerGuessedNumber = scanner.nextInt();
                if (playerGuessedNumber == guessRight)
                    System.out.println("congratulation, you guessed rightly");
            }

        }
    }
    private static int continueGame(){
        int guessNumber;
        guessNumber = numberToBeGuessed.nextInt(1, 100);
        System.out.println(guessNumber);
        System.out.println(" try make a guess between 1 - 100");

     return guessNumber;
    }
    private static void toContinue(){
        System.out.println("do you want to continue?");
        System.out.println("""
                1.press 1 for Yes.
                2.press 2 for No.
                """);
    }
    private static void letTheGuessGameBegins(){
        numberTobeGuessed();


        toContinue();
        int choice = scanner.nextInt();
        while(choice==1){
            switch (choice) {
                case 1 -> {numberTobeGuessed();
                    toContinue();
                    choice = scanner.nextInt();}

                case 2 -> System.exit(2);
            }
        }
    }
}
