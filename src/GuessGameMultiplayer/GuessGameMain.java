package GuessGameMultiplayer;

import java.util.Scanner;

public class GuessGameMain {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("enter number of players ");
        int numberOfPlayers = scanner.nextInt();
        GuessGame.register(numberOfPlayers);

        for (int i = 0; i <numberOfPlayers ; i++) {
            System.out.println(" enter Player"+ (i+1) +" " + "name");
            String playerName = scanner.next();
           // System.out.println("how much do you want to deposit to bet from");
            //double amount = scanner.nextInt();
            GuessGame.registerPlayer(playerName, i);
            System.out.println();

        }
        GuessGame.generateRandomNumber();

        do {
            int currentPlayer = GuessGame.getCurrentPlayer();
            String currentPlayerName = GuessGame.getPlayer(currentPlayer).getPlayerName();
            System.out.println(currentPlayerName + ", It's your turn. Guess a number between 1 and 100");
            int guess = scanner.nextInt();
            GuessGame.playGuessGame(guess);
        }while (!GuessGame.gameIsWon());

    }
}
