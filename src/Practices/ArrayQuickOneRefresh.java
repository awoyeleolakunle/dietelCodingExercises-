package Practices;

import java.util.Arrays;

public class ArrayQuickOneRefresh {
    public static void main(String[] args) {
        int[][] array = new int[2][];
        array[0] = new int[5];
        array[1] = new int[3];
        int number = 1;
        for (int index = 0; index < array.length; index++) {

            for (int count = 0; count < array[index].length; count++) {
                array[index][count] = number;
                number++;

            }
        }
        /*for (int index = 0; index < array2.length ; index++) {
            for (int count = 0; count < array2.length+2 ; count++) {

                array2[index][count]= number;
                number++;
            }

        }*/
       /* int [][] array = new int[3][4];
        int number =1;
        for (int index = 0; index < array.length ; index++) {
            for (int count = 0; count <array[index].length ; count++) {
                array[index][count] = number;
                number++;*/


        System.out.print(Arrays.deepToString(array));
        //System.out.println();
        //System.out.print(Arrays.deepToString(array2));

      /*  int [][] array = {{1,2},{3},{4,5,6}};
        for (int index = 0; index < array.length-2 ; index++) {
            for (int count = 0; count < 1 ; count++) {
                System.out.println(Arrays.deepToString( array));*/


    }
}