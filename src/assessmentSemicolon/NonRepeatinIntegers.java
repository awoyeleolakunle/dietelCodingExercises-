package assessmentSemicolon;

import java.util.ArrayList;
import java.util.List;

public class NonRepeatinIntegers {
    public static void main(String[] args) {
        int [] numbers = {5,3,4,5,5,6,6};
        System.out.println(nonRepeatingIntegers(numbers));
    }



    private static int nonRepeatingIntegers(int []numbers){

        int count =0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j <numbers.length ; j++) {
               if( numbers[i] == numbers[j])
                   count++;
            }
            if (count<2){ list.add(numbers[i]);}
            count =0;
        }
        return list.get(0);
    }
}
