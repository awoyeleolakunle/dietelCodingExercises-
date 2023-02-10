package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClassExample1 {
    public static void main(String[] args) {
       // int [] numbers = new int[10];
        //System.out.println(Arrays.toString(numbers));
        //numbers[0] = 9;
        //numbers[1] =8;
        //numbers[9] = 100;
        //numbers[4] =29;
        //System.out.println(Arrays.toString(numbers));

        Scanner scanner = new Scanner(System.in);

        System.out.println("how many scores you wan add");
        int numberOfScores = scanner.nextInt();
        int[] scores = new int[numberOfScores];
        int sum=0;

        for(int index=0; index < numberOfScores;index++){
            System.out.println("enter number "+(index+1));
            scores[index]= scanner.nextInt();
            System.out.println("After storing scores--> "+ Arrays.toString(scores));
            System.out.println("\n".repeat(1));
            sum+=scores[index];
        }
        //for (int index =0; index<scores.length; index++){
           // sum+=scores[index];

        System.out.println("sum of scores is "+sum);
    }
}
