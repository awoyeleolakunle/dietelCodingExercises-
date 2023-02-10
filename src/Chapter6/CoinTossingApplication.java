package Chapter6;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CoinTossingApplication {
    private static CoinTossGame game = new CoinTossGame();

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(CoinTossGame.getGameMenu());
        int userInput = scanner.nextInt();
        do {
            switch (userInput) {

                case 1-> game.flip();
                case 2->  goodbye();

            }
            System.out.println(CoinTossGame.getGameMenu());
            userInput = scanner.nextInt();

        } while (userInput > 0 && userInput < 3);
    }

        private static void goodbye () throws InterruptedException {
        displayGoodbye();
            System.out.print("shutting down");
            for (int counter = 0; counter < 5; counter++) {
                TimeUnit.SECONDS.sleep(1);
                System.out.print(".");
                System.exit(0);
            }
        }
        private static void displayGoodbye(){
        game.displayGameResult();

        }
    }
