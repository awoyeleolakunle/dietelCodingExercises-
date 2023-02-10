package Chapter7;

import java.util.Scanner;

public class ArrayPractices {
    public static void main(String[] args) {
       // int b[] = new int [100];
       // int c[] =  {27,25,34,56,67};
        //System.out.printf("   %s%8s%n", "index", "value");
       // for (int counter = 0; counter <c.length ; counter++) {
          //  System.out.printf("%5d%8d%n" , counter,  c[counter]);
           // int array[] = new int[array_lenght];
       // System.out.printf("  %s%8s%n", "index","value");
       // for (int counter = 0; counter <array_lenght ; counter++) {
           // array[counter] = 2+2*counter;
       // }

       // for (int counter = 0; counter <array_lenght ; counter++) {
           // System.out.printf("%5d%8d%n", counter, array[counter]);

        //}

        //int[] numbers = { 87, 68, 94, 100, 83, 78, 85,91, 76, 87};
        //int total =0;
        //for (int index = 0; index <numbers.length ; index++) {
          //  total += numbers[index];
            //System.out.println(total);
        //}
            int [] grade = {0,0,0,0,0,0,1,2,4,2,1};
        System.out.println("garde range");
        for (int counter = 0; counter < grade.length ; counter++) {
            if (counter==10){
                System.out.printf("%5d: ", 100);}
            else {
                System.out.printf("%02d - %02d: ", counter*10, counter*10+9);
            }
            for (int star = 0; star <grade[counter] ; star++) {
                System.out.print("*");

            }
            System.out.println();
        }

        }
       // private static final int array_lenght= 10;
    }

