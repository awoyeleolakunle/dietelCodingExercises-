package Practices;

import java.util.Arrays;
import java.util.Scanner;

public class AddingToLastIndexArray {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int array[] = new int[5];
        int[] numbers = {9, 2, 3, 4, 1};

        for (int index = 0; index < array.length; index++) {
            for (int i = 0; i <= index; i++) {

                if (i == array.length-1 ) {
                ++numbers[index];
            }
        }

    }
        System.out.println(Arrays.toString(numbers));
    }
}



