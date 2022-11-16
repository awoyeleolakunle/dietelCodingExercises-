package Chapter4;

import java.util.Scanner;

public class SumOfOddAndEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int odd = 0;
        int even = 0;
        int sumEven = 0;
        int sumOdd = 0;
        int count = 1;
        System.out.println("enter a number ");
        int userInput = input.nextInt();
        while (userInput>= 0){
            if (userInput % 2 == 0){
                sumEven +=  userInput;
                even += 1;
            }
            else { odd+= 1;
                sumOdd += userInput;
            }
            System.out.println("enter a number or a negative number to quit");
            userInput = input.nextInt();

        }
        System.out.printf("number of odd number entered is %d%n ",odd);
        System.out.printf("number of even number entered is %d%n ",even);
        System.out.printf("sum of even entered is %d%n ",sumEven);
        System.out.printf("sum of odds entered is %d%n ",sumOdd);


    }
}
