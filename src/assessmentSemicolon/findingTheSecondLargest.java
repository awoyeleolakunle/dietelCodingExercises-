package assessmentSemicolon;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findingTheSecondLargest {
    public static void main(String[] args) {
        System.out.println(secondLargest(1, 2, 6, 4, 5, 2, 7));
    }

    private static int secondLargest(int... numbers) {
        int[] array = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            array[i] = numbers[i];
        }
        int highest = 0;
        int secondHighest = highest;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > highest) {
                secondHighest = highest;
                highest = array[i];
            }
        }
        return secondHighest;
    }

}
