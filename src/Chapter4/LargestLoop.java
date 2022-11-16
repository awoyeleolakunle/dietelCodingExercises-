package Chapter4;

import java.util.Scanner;

public class LargestLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       // int largestNumber = input.nextInt();
        int smallestNumber = 0;
        int largestNumber = smallestNumber;
        System.out.println("Enter a number");
        int userInput = input.nextInt();
        while(input.nextInt()!=0); {

            if (userInput > largestNumber) {
                largestNumber = userInput;
            }
            if (userInput < smallestNumber) {
                smallestNumber = userInput;
            }
            System.out.println( "enter a number or enter 0 to quit");
             userInput = input.nextInt();

        }


            System.out.println(largestNumber + "is the largest number");
            System.out.println(smallestNumber + "is the smallest number");
        }

    }
