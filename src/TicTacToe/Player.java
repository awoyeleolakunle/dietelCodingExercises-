package TicTacToe;

public class Player {
    private String playerName;
    private static int PlayerNumber;
    private static int playerCount =1;
    private static int currentPlayer;
    private  String playerSymbol;
    private  int rowPosition;
    private  int columnPosition;

    public Player(String playerName){
        this.playerName = playerName;

        switch (currentPlayer) {
            case 0 -> {playerSymbol = PositionValue.X.getSymbol();}
            case 1 -> {playerSymbol = PositionValue.O.getSymbol();}
        }
           adjustCurrentPlayer();

       // PlayerNumber = playerCount;
        //playerCount++;
    }

    public void adjustCurrentPlayer() {
        currentPlayer++;
        if (currentPlayer > 1){
            currentPlayer = 0;}

    }


    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public  String getPlayerName() {
        return playerName;
    }

    public static void setPlayerNumber(int playerNumber) {
        PlayerNumber = playerNumber;
    }

    public static int getPlayerNumber() {
        return PlayerNumber;
    }

    public String getPlayerSymbol() {
        return playerSymbol;
    }

    //public void setCurrentPlayer(int currentPlayer) {
      //  Player.currentPlayer = currentPlayer;
        //currentPlayer =0;
        //currentPlayer++;
    //}

    public static int getCurrentPlayer() {
        return currentPlayer;
    }

    public void setRowPosition(int rowPosition) {
        this.rowPosition = rowPosition;
    }

    public int getRowPosition() {
        return rowPosition;
    }

    public void setColumnPosition(int columnPosition) {
        this.columnPosition = columnPosition;
    }

    public int getColumnPosition() {
        return columnPosition;
    }
}
