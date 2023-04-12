package LeetcodeAlgorithmBuilding;

import java.util.Arrays;
import java.util.Scanner;

public class RotateImage {

    public static void main(String[] args) {
        rotateImage(3,3);
    }

    private static void rotateImage(int row, int column) {
        int[][] arrayOfTable = new int[row][column];
        int[][] newArrayOfTable = new int[row][column];

        int k = 0;
        while (k < arrayOfTable.length) {
            for (int i = 0; i < arrayOfTable.length; i++) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("enter table value for  row " + (k+1) + " in index " + i);
                int value = scanner.nextInt();
                arrayOfTable[k][i] = value;

                for (int[] array : arrayOfTable) {
                    System.out.println(Arrays.toString(array));
                }
            }
            k++;
        }
        int j = 0;
        int n = 0;
        while (j < arrayOfTable.length) {
            for (int i = arrayOfTable.length-1; i >= 0; i--) {
               arrayOfTable[i][n]= Integer.parseInt(Arrays.deepToString(arrayOfTable));
                n++;
            }
            j++;
            n=0;
        }
        System.out.println("This is the rotated Table of 90 degrees");

        System.out.println(Arrays.deepToString(arrayOfTable));
        for (int []array: arrayOfTable) {
            System.out.println(Arrays.toString(array));
        }
    }

}