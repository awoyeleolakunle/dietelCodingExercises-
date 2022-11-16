package Chapter4;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int factor = 0;
        System.out.println("enter a number ");
        int userInput = input.nextInt();

        while (count < userInput) {
            if (userInput % count == 0) {
                factor += 1;
            }
        }
        if (factor == 2) {

            System.out.println(factor + "is a prime number");
        }
        else {
            System.out.println(factor + "is not a prime number");

        }
    }
}