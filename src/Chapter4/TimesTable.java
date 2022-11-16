package Chapter4;

import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        System.out.println("enter a number");
        int userInput = input.nextInt();
        while (counter <= 12) {
           int product = userInput * counter;
            System.out.printf(" %d times %d is %d%n ", userInput, counter, product);
            counter += 1;

        }

    }
}
