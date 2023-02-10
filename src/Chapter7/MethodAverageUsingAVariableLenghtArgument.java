package Chapter7;

import java.util.Scanner;

public class MethodAverageUsingAVariableLenghtArgument {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

         double average = findAverage(30,20,30,20,50,60,20,10,57,50,57);
        System.out.printf("the average of the numbers is : %.2f", average);

    }

    private static int findAverage(int... numbers) {
        int total = 0;
            for (int number : numbers) {
                total += number;
            }
            return total / numbers.length;
    }
}
