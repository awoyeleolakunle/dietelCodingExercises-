package Chapter4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExampleClass {
    private static List<Integer>nums= new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("continue or stop");
        String userInput = scanner.next();

        while (!userInput.equals("stop")) {
            System.out.println("enter number");
            nums.add(scanner.nextInt());
            System.out.println("continue or stop");
            userInput = scanner.next();
        }
        //     int maximum = 0;
        // for (int i = 0; i < nums.size(); i++){
        //   System.out.println(nums.get(i));
        // maximum=Math.max(maximum, nums.get(i));
  //  }
        Integer max = Collections.max(nums);
        System.out.println("maximum:: "+max);

        //System.out.println("maximum:: "+maximum);
    }

}
