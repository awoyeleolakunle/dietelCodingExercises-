package TicTacToe;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeMain {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

       // System.out.println(" how many players");
        //int numberOfPlayers = scanner.nextInt();
        //TicTacToeGame.register(numberOfPlayers);

        for (int i = 0; i < 2; i++) {
            System.out.println("enter  Player " + (i+1) + " name");
            String playerName = scanner.next();
            TicTacToeGame.registerPlayer(playerName, i);



        }
        Player [] players = new Player[2];

        int move;
        TicTacToeGame.makeBoardEmpty();
        do {

            int currentPlayer = Player.getCurrentPlayer();
            System.out.println( "Player" + (currentPlayer+1) + " pick a number");
            move = scanner.nextInt();
            try {
                TicTacToeGame.setPlayerMoves(move);

            }
            catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
            //Player.adjustCurrentPlayer();

        } while (!TicTacToeGame.isWon());
        TicTacToeGame.congratulationMessage();
    }
}
