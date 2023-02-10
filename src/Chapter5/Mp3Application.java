package Chapter5;

import java.util.Scanner;

public class Mp3Application {
    public static void main(String[] args) {
        int count = 0;
        Scanner orinde = new Scanner(System.in);
        System.out.println("enter a number");
        int userInput = orinde.nextInt();
        while (userInput != 0) {
            Mp3 oraimo = new Mp3();
            oraimo.isLogin(true);
            if (userInput == 1) {
                System.out.println(oraimo.showMyPlayList());
            }

            // check my songs
            if (userInput == 2) {
                System.out.println(oraimo.showMySongs());
            }

            // check my genre
            if (userInput == 3) {
                System.out.println(oraimo.displayMyGenre());
            }

            count += 1;

            System.out.println("Enter another number for display");
            userInput = orinde.nextInt();
        }
    }
}