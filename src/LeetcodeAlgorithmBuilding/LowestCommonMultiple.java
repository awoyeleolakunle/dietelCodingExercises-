package LeetcodeAlgorithmBuilding;

import java.util.ArrayList;
import java.util.Arrays;

public class LowestCommonMultiple {
    public static int[] getLowestCommonMultipleOf(int number) {
        //ArrayList<Integer> listOfLcm = new ArrayList<>();
        String temp = String.valueOf(number);
        int [] newArray = new int[temp.length()+ temp.length()+temp.length()];
        int k=0;
        for (int i = 2; i <= number; i++) {
            while (((number % i) == 0)) {
                number /= i;
                newArray[k]= i;k++;}}

        int frequency =0;
        for (int i = 0; i <newArray.length ; i++) {
            if(newArray[i]!=0)
                ++frequency;
        }

        int[] arrayOfLcm = new int[frequency];

        for (int i = 0; i <frequency ; i++) {
            arrayOfLcm[i]=newArray[i];
        }
        return arrayOfLcm;
    }
}
