package Chapter4;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        int factor = 0;
        System.out.println("enter a number ");
        int userInput = input.nextInt();

        while (count <= userInput) {
            if (userInput % count == 0) {
                factor += 1;
            }
            count+=1;
        }
        System.out.printf( " has %d factors %n ", factor);

    }
}