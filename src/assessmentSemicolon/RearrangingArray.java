package assessmentSemicolon;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RearrangingArray {

    public static void main(String[] args) {
        int[] array = {-9,-2,5,6,-4,9};
        System.out.println(Arrays.toString(rearrangingArray(array)));
    }

    private static int[] rearrangingArray(int [] array){
        int temp = 0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array.length ; j++) {
                if(array[i]<array[j]){
                    temp = array[i];
                    array[i]=array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
