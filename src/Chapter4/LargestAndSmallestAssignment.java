package Chapter4;

import java.util.Scanner;

public class LargestAndSmallestAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;
        System.out.println("enter a number");
        int userInput = input.nextInt();
        while (userInput !=0){
            if (userInput > largestNumber){
                largestNumber = userInput;
            }
            if (userInput < smallestNumber) {
            smallestNumber = userInput;
            }
            System.out.println("enter number or 000 to quit");
            userInput = input.nextInt();

        }
            System.out.println(largestNumber + " is the largest");
            System.out.println(smallestNumber + " is the smallest");
        }

    }

