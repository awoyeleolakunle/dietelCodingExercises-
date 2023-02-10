package Practices;

import java.util.Arrays;

public class ArrayOfLenghtOfEvenNumbers {
    public static void main(String[] args) {
        int[] array = new int[10];
        int number = 2;
        for (int index = 0; index < array.length; index ++) {
                array[index] = number;
            number+=2;

        }
        System.out.println(Arrays.toString(array));
    }
}