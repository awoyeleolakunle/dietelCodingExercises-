package LeetcodeAlgorithmBuilding;

import java.util.ArrayList;
import java.util.Arrays;

public class classIndexOfSum {

    public static void main(String[] args) {

        int[] array = {2, 3, 4, 5};
        sumOf(array);
    }

        private static void sumOf(int[] array){
            int[]  newArray = new int [array.length];
            for (int i = 0; i <array.length ; i++) {
                newArray[i] = array[i];
            }
            int newSum[] = new int[array.length];

            int k = 0;
            int n = 0;

            int sumNum = 0;
            // int [] sum= new int[array.length];

            for (int i = 0; i < array.length; i++) {
                array[i] = 0;
                for (int j = 0; j < array.length; j++) {
                    sumNum += array[j];
                }
                newSum[n] = sumNum;
                n++;
                System.out.println(sumNum);
                sumNum = 0;
                array[i] = newArray[k];
                k++;
            }
            System.out.println(Arrays.toString(newSum));
            int w = 0;
            int[] indexOfSum = new int[2];
            for (int i = 0; i < 4; i++) {
                int highest = newSum[0];
                if (newSum[i] > highest) {
                    highest = newSum[i];
                    indexOfSum[0] = i;
                }
                w++;

                int lowest = newSum[0];
                if (newSum[i] < lowest) {
                    lowest = newSum[i];
                    System.out.println(lowest);
                    indexOfSum[1] = i;
                }
                System.out.println(highest);
            }

            System.out.println(Arrays.toString(indexOfSum));

        }
    }
