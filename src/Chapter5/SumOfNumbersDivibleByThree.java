package Chapter5;

import java.util.Scanner;

public class SumOfNumbersDivibleByThree {
    public static void main(String[] args) {
        int counter =1;
        int number =0;
        int sumOfDivisibleByThree= 0;
        while (counter <= 30) {
            if(counter %3 == 0){
                sumOfDivisibleByThree+= counter;
                number++;}

            counter+=1;

        }
        System.out.println(" Total number of numbers divisible by 3 between 1 and 30 is: " + number);
        System.out.println("the sum of all numbers divible by three is : " + sumOfDivisibleByThree);

    }

}
