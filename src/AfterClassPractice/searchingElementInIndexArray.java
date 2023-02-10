package AfterClassPractice;

import Practices.BinarySearchArray;

import java.util.Scanner;

public class searchingElementInIndexArray {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // int [][] array = {{1,2,3},{4,5,6},{7,8,9}};
        //for (int i = 0; i <3 ; i++) {
        //  for (int j = 0; j <3; j++) {
        //     System.out.print(array [i][j]+"");

        //}
        // System.out.println();
        //}
        Scanner scanner = new Scanner(System.in);
        BinarySearchArray obi = new BinarySearchArray();
        int[] arr = new int[5];
        System.out.println("Enter the numbers you want to search in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(" enter the number you want to search for");
        int number = scanner.nextInt();
        int n = arr.length;
        int result = obi.BinarySearchArray(arr, 0, n - 1, number);
        if (result == -1) {
            System.out.println(" element not present ");
        } else {
            System.out.println("Element " + number + " found at index " + result);

        }
    }
}


