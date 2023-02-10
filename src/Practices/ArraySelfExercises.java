package Practices;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySelfExercises {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("how many numbers do you want to input ");
        int number = scanner.nextInt();
        int [] numberLenght = new int[number];

        System.out.println(" enter a number you will want to sum");
        int sum = scanner.nextInt();

       // for (int index = 0; index < number ; index++) {
         //   System.out.println("enter numbers");
           // numberLenght[index] = scanner.nextInt();
        //}
       // System.out.println(Arrays.toString(numberLenght));
        for (int index = 0; index <= numberLenght.length; index++) {
            System.out.println("enter numbers");
            numberLenght[index] = scanner.nextInt();
            for (int j = 0; j <=numberLenght[index] ; j++) {
                if ((sum-index ==numberLenght[index])){
                    System.out.println(index + " " + numberLenght[index]);

            }

        }


            }

        }


    }

