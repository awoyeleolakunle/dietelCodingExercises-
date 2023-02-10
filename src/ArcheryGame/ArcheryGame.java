package ArcheryGame;

import java.security.SecureRandom;
import java.util.Arrays;

public class ArcheryGame {
    private static final ArcheryPlayers [] players = new ArcheryPlayers[4];
    private static final SecureRandom random = new SecureRandom();
    private static int [] total;


    public static void registerPlayers(String playerName, int index){
        players[index] = new ArcheryPlayers(playerName);
    }
    public static void playGame() {
        for (int round = 0; round < 3; round++) {
            System.out.println("ROUND " + (round + 1));
            for (ArcheryPlayers player : players) {
                int randomNumber = 1 + random.nextInt(10);
                player.setScores(randomNumber, round);
                player.setTotalScore(randomNumber, round);
               // player.getTotalScore();
                //System.out.println(playerName +player.getPlayerNumber() + " played "+ randomNumber);
                System.out.println((player.getPlayerName() + " " + "played" + " " + randomNumber));
            }
        }


            for (ArcheryPlayers player : players) {
                System.out.print(player.getPlayerName());
                for (int i = 0; i <3 ; i++) {
                    int total = 0;
                    total+= player.getTotalScore()[i];
                    System.out.printf("%2s ", total);
                }
                System.out.println();
            }
    }

}
