package Chapter7;

import java.util.Arrays;

public class LoopingToModifyTheClassWorkDone {
    public static void main(String[] args) {

        int[][] numbers = new int[3][3];
        int number = 1;
        for (int counter = 0; counter < 3; counter++) {
            for (int index = 0; index <3 ; index++) {
               numbers[counter][index] =number;
                number++;

                }
            }

        System.out.println(Arrays.deepToString(numbers));
            }

        }
 