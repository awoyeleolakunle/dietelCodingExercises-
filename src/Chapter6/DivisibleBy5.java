package Chapter6;

import java.util.Scanner;


public class DivisibleBy5 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(" Enter how many number you want to input: ");
        int num = scanner.nextInt();
        newMethodForIsDivisibleBy5(num);


    }

    private static void newMethodForIsDivisibleBy5(int number) {
        int[] newNumber = new int[number];
        int i;
        for (i = 0; i < number; i++) {
            System.out.println(" enter a new number");
            newNumber[i] = scanner.nextInt();
            if (newNumber[i] % 5 == 0) {
                System.out.println(true);
               // System.out.println(newNumber[i] + " is true");

            }
            else {
                System.out.println(false);
            }


        }

    }
}