package TicTacToe;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeMain {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(TicTacToeGame.isWon());

        for (int i = 0; i <2; i++) {
            System.out.println("enter  Player" + (i+1)+ "'s" + " name");
            String playerName = scanner.next();
            TicTacToeGame.registerPlayer(playerName, i);
        }

        TicTacToeGame.makeBoardEmpty();

        do {
            System.out.println( TicTacToeGame.getPlayerName() +  " pick a number");
            int move = scanner.nextInt();
            try {
                TicTacToeGame.setPlayerMoves(move);
            }
            catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

        } while (!TicTacToeGame.isWon());
        TicTacToeGame.congratulationMessage();
    }
}
