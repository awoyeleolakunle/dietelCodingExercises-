package assessmentSemicolon;

import java.util.ArrayList;
import java.util.List;

public class listOfProductOfAllElement {
    public static void main(String[] args) {
        int list[] = {1,2,3,4};
        listOfProductOfAllElement(list);
    }


    private static void listOfProductOfAllElement(int []numbers){
        List<Integer> list = new ArrayList<>();
        int product =1;

        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers.length ; j++) {
                if(i!=j){
                    product*=numbers[j];
                }
            }
            list.add(product);
            product =1;
        }
        System.out.println(list);

    }
}
