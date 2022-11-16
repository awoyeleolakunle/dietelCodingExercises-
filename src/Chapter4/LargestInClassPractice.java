package Chapter4;

import java.util.Scanner;

public class LargestInClassPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("enter a number ");
        int userInput = input.nextInt();
        int largestNumber = userInput;
        int lowestNumber = userInput;
      while (userInput!= 0) {
          if (userInput > largestNumber) {
              largestNumber = userInput;
          }
          if (userInput < lowestNumber) {
              lowestNumber = userInput;
          }
          System.out.println(" enter another number or enter 000 to quit");
          userInput = input.nextInt();
      }

        System.out.println("largest number is " + largestNumber);
        System.out.println("lowest number is "+ lowestNumber);
          }
      }


