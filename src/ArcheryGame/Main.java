package ArcheryGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter player "+ (i+1)+ " name");
            String playerName = scanner.nextLine();
            ArcheryGame.registerPlayers(playerName, i);
        }
        ArcheryGame.playGame();
    }
}
