package Chapter6;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a number you want to sum up each digit");
        int userInput = scanner.nextInt();
        isPerfectNumber(userInput);
    }
    private static void isPerfectNumber(int number){
        int firstDigit = number/1000;
        int secondNumber = number%1000;
        int secondDigit = secondNumber/100;
        int thirdNumber = secondNumber%100;
        int thirdDigit = thirdNumber/10;
        int fourthNumber = thirdNumber%10;
        int fourthDigit = fourthNumber/1;
        int sum = firstDigit + secondDigit + thirdDigit + fourthDigit;

            System.out.println("sum of each digit of number is "+sum);

    }
}
