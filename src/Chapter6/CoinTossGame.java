package Chapter6;

import java.io.StringReader;
import java.security.SecureRandom;

public class CoinTossGame {
    private int headsCount;
    private int tailsCount;
    private Coin coin;

    public static String getGameMenu() {
        String menu = """
                1. Toss Coin
                2. Exit Game
                """;
        return menu;
    }

    public String flip() {

        int randomNumber = generateRandomNumberBetweenZeroAndOne();
        if (randomNumber == 0){
            headsCount++;
        return coin.HEADS.name();}
        tailsCount++;
        return coin.TAILS.name();
    }

    public int getHeadsCount() {
        return headsCount;
    }

    public int getTailsCount() {
        return tailsCount;
    }

    private static int generateRandomNumberBetweenZeroAndOne() {
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt(2);
    }
    public void displayGameResult(){
        int totalFlip = headsCount + tailsCount;

        //System.out.println(String.format(2total Tosses: %d\nHEADS));
        System.out.printf("total flip is %d%n total Head Count %d%n Tail count %d%n " , totalFlip, headsCount,tailsCount);
    }
}