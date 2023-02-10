package GuessGameMultiplayer;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessGame {
    private static final Scanner scanner = new Scanner(System.in);
    private static Player[] players;
    private static final SecureRandom secureRandom = new SecureRandom();
    private static int currentPlayer;
    private static int randomNumber;
    private static boolean gameIsWon;

    public static void register(int numberOfPlayers) {
        players = new Player[numberOfPlayers];
    }
    public static void registerPlayer(String playerName, int index){
        players[index] = new Player(playerName);
    }

    public static void generateRandomNumber() {
        randomNumber = 1 + secureRandom.nextInt(100);
    }

    public static int getRandomNumber() {
        return randomNumber;
    }

    public static void playGuessGame(int guess) {
        //players[i].setBalanceAfterWinning(100);
        //players[i].setBalanceAfterLosing(100);
        //players[i].getGuessedNumber();
        //System.out.println(players[i].getPlayerName() + " " + "guessed " + userInput);

        if (guess < randomNumber) {
            //players[i].getBalanceAfterLosing();
            System.out.println("oh. Too low");
            gameIsWon=false;
        } else if (guess > randomNumber) {
            //players[i].getBalanceAfterLosing();
            System.out.println("That is too high");
            gameIsWon=false;
        } else {
            gameIsWon = true;
            System.out.println("Congratulations "+players[currentPlayer].getPlayerName() + ", you won!");
        }
        currentPlayer++;
        if (currentPlayer > 1) {
            currentPlayer = 0;
        }
    }
    public static Player getPlayer(int index){
        return players[index];
    }

    public static int getCurrentPlayer() {
        return currentPlayer;
    }

    public static boolean gameIsWon() {
        return gameIsWon;
    }
}

