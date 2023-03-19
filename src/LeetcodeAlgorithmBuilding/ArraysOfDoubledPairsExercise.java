package LeetcodeAlgorithmBuilding;

import org.jetbrains.annotations.NotNull;

public class ArraysOfDoubledPairsExercise {
    public static void main(String[] args) {
        int [] array =  {4, -2, 2, 4};
       boolean result =  arrayOfDoubledPairs(array);
        System.out.println(result);
        }

    private static boolean arrayOfDoubledPairs( int [] array){
        for (int i = 0; i < array.length / 2; i++) {
            if (array[2 * i + 1] == 2 * array[2 * i]) return true;
        }return false;
    }

}
