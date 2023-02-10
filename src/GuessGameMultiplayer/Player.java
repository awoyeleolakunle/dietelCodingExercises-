package GuessGameMultiplayer;

public class Player {
    private static int playerCount = 1;
    private String name;
    private int playerNumber;
    private double balance;

    //private int[] guessedNumber = new int[2];
    private boolean hasWon;

    public Player(String name) {
        this.name = name;
        this.balance=balance;
        this.playerNumber = playerCount;
        playerCount++;

    }
    public String getPlayerName() {
        return name;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    //public void setGuessedNumber(int guessedNumber, int index) {
      //  this.guessedNumber[index] = guessedNumber;


   // public int[] getGuessedNumber() {
     //   return guessedNumber;
    //}

   // public void setBalance(double balance) {
     //   this.balance = balance;


    public double getBalance() {
        return balance;
    }

    public void setBalanceAfterWinning(double amount){
        balance = balance + amount;
    }

    public double getBalanceAfterWinning() {
        return balance;
    }
    public void setBalanceAfterLosing(double amount){
        balance = balance - amount;
    }
    public double getBalanceAfterLosing(){
        return balance;
    }
}