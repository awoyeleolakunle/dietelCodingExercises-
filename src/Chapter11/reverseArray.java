package Chapter11;

import java.lang.reflect.Array;
import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int [] array = {10, 12, 3, 4};
        int [] newArray= new int[array.length];
        int k=0;

        for (int i = array.length-1; i >=0 ; i--){
            newArray[k]= array[i];
            k++;
        }

        System.out.println(Arrays.toString(newArray));
    }
}
