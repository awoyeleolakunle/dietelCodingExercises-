package TicTacToe;

import java.util.Arrays;

import static TicTacToe.PositionValue.*;

public class TicTacToeGame {
    private static final String[][] boards = new String[3][3];
    private static final PositionValue positionValue = EMPTY;
    private static final Player[] players = new Player[2];
    private static final String player1Symbol = String.valueOf(X.getSymbol());
    private static final String getPlayer2Symbol = String.valueOf(O.getSymbol());
    private static int currentPlayer;
    private static int playerMove;
    private static boolean isWon;


    public static void register(int numberOfPlayers) {
        Player[] players = new Player[numberOfPlayers];
    }

    public static void registerPlayer(String playerName, int index) {
            players[index] = new Player(playerName);
    }

    public static void makeBoardEmpty() {
        for (String[] board : boards) {
            Arrays.fill(board, EMPTY.getSymbol());
            System.out.println(Arrays.deepToString(board));
        }
    }

    public static void setPlayerMoves(int playerposition) {
        if (playerposition<1 || playerposition>9) throw new IllegalArgumentException("please enter a number between 1 - 9 ");
        playerposition -= 1;
        int row = playerposition / boards.length;
        int column = playerposition % boards.length;
        players[Player.getCurrentPlayer()].setRowPosition(row);
        players[Player.getCurrentPlayer()].setColumnPosition(column);

        setBoard();
        players[getCurrentPlayer()].adjustCurrentPlayer();

    }

    public static void setBoard() {
        int row = players[Player.getCurrentPlayer()].getRowPosition();
        int column = players[Player.getCurrentPlayer()].getColumnPosition();
        if (!boards[row][column].equals(EMPTY.getSymbol())) {
            throw new IllegalArgumentException("Position taken, pick another number");
        }
        boards[row][column] = players[Player.getCurrentPlayer()].getPlayerSymbol();
        showBoard();
        winningPosition1();
        winningPosition2();
        winningPosition3();
        winningPosition4();
        winningPosition5();
        winningPosition6();
        winningPosition7();
        winningPosition8();


        //Player.adjustCurrentPlayer();
    }

    public static void showBoard() {
        for (String[] row : boards) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int getCurrentPlayer() {
        return Player.getCurrentPlayer();
    }
    public static boolean isWon(){
        return isWon;
    }

    public static boolean winningPosition1() {
        if (boards[0][0].equals(X.getSymbol()) && boards[0][1].equals(X.getSymbol()) && boards[0][2].equals(X.getSymbol())) {
            isWon = true;
        }
        if (boards[0][0].equals(O.getSymbol()) && boards[0][1].equals(O.getSymbol()) && boards[0][2].equals(O.getSymbol())) {
            isWon = true;
        }
        return isWon();
    }

    public static boolean winningPosition2() {
        if (boards[0][0].equals(X.getSymbol()) && boards[1][0].equals(X.getSymbol()) && boards[2][0].equals(X.getSymbol()))
            isWon = true;
        if (boards[0][0].equals(O.getSymbol()) && boards[1][0].equals(O.getSymbol()) && boards[2][0].equals(O.getSymbol()))
            isWon = true;
        return isWon();
}

    public static boolean winningPosition3() {
        if (boards[0][0].equals(X.getSymbol()) && boards[1][1].equals(X.getSymbol()) && boards[2][2].equals(X.getSymbol())) {
            isWon = true;}
            if (boards[0][0].equals(O.getSymbol()) && boards[1][1].equals(O.getSymbol()) && boards[2][2].equals(O.getSymbol())) {
                isWon = true;
        } return isWon();
    }
    public static boolean winningPosition4(){
        if (boards[1][0].equals(X.getSymbol()) && boards[1][1].equals(X.getSymbol()) && boards[1][2].equals(X.getSymbol()))
            isWon = true;
        if (boards[1][0].equals(O.getSymbol()) && boards[1][1].equals(O.getSymbol()) && boards[1][2].equals(O.getSymbol()))
                isWon = true;
        return isWon();

    }
    public static boolean winningPosition5(){
        if (boards[2][0].equals(X.getSymbol()) && boards[2][1].equals(X.getSymbol()) && boards[2][2].equals(X.getSymbol()))
            isWon = true;
        if (boards[2][0].equals(O.getSymbol()) && boards[2][1].equals(O.getSymbol()) && boards[2][2].equals(O.getSymbol()))
            isWon = true;
        return isWon();
    }
    public static boolean winningPosition6(){
        if (boards[0][1].equals(X.getSymbol()) && boards[1][1].equals(X.getSymbol()) && boards[2][1].equals(X.getSymbol()))
            isWon = true;
        if (boards[0][1].equals(O.getSymbol()) && boards[1][1].equals(O.getSymbol()) && boards[2][1].equals(O.getSymbol()))
            isWon = true;
        return isWon();
    }
    public static boolean winningPosition7(){
        if (boards[0][2].equals(X.getSymbol()) && boards[1][2].equals(X.getSymbol()) && boards[2][2].equals(X.getSymbol()))
            isWon = true;
        if (boards[0][2].equals(O.getSymbol()) && boards[1][2].equals(O.getSymbol()) && boards[2][2].equals(O.getSymbol()))
            isWon = true;

        return isWon();
    }
    public static boolean winningPosition8() {
        if (boards[0][2].equals(X.getSymbol()) && boards[1][1].equals(X.getSymbol()) && boards[2][0].equals(X.getSymbol()))
            isWon = true;
        if (boards[0][2].equals(O.getSymbol()) && boards[1][1].equals(O.getSymbol()) && boards[2][0].equals(O.getSymbol()))
            isWon = true;
        return isWon();
    }

    public static String getPlayerName(){
        return players[getCurrentPlayer()].getPlayerName();

    }
    public static void congratulationMessage(){
        players[getCurrentPlayer()].adjustCurrentPlayer();
        System.out.println(  "Congratulations "+ players[getCurrentPlayer()].getPlayerName()  + " You won");
    }
}

