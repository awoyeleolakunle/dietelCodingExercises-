package Practices;

import java.util.Scanner;

public class StudentScore {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int numberOfPasses = 0;
        int numberofFailure = 0;
        int sumOfPasses = 0;
        int sumOfFailure= 0;
        int count =1;
        System.out.println("Enter scores result ");
        int scores = input.nextInt();
        while (count <=10){
            if (scores > 60){
                numberOfPasses+=1;
                sumOfPasses +=scores;}
            else{
                numberofFailure+=1;
                sumOfFailure +=scores;}
                count += 1;
            System.out.println("Enter scores result ");
            scores = input.nextInt();

            }
            System.out.println(numberOfPasses + " is the total number of passes");
            System.out.println(numberofFailure +" is the total number of failures");
        System.out.println(sumOfPasses + " is the sum of passes ");
        System.out.println(sumOfFailure + " is the sum of failure ");
        }
    }

