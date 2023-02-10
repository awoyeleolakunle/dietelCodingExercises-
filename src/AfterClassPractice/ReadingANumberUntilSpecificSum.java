package AfterClassPractice;

import java.util.Scanner;

public class ReadingANumberUntilSpecificSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter=0;
        int sum = 0;
        System.out.println("enter first number");
        int firstNumber = input.nextInt();
        while (sum < firstNumber) {
            System.out.println("enter an integer");
            int userInput = input.nextInt();
            sum += userInput;
            counter++;
        }
        System.out.println(sum);
    }
}
