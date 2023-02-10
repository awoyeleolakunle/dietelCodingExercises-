package Chapter7;

import java.util.Scanner;

public class IndexOfFirstTwoIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many numbers would you love to input");
        int userInput = scanner.nextInt();
        int[] array = new int[userInput];
        System.out.println(" enter the sum number you want to find it's index");
        int sum = scanner.nextInt();


        for (int index = 0; index < array.length; index++) {
            System.out.println("enter number in index " + "[" + index + "]");
            array[index] = scanner.nextInt();
            for (int counter = 0; counter <= index; counter++) {
                if (array[counter] + array[index] == sum)
                    System.out.printf("First number is found in index : %d%n. The second number is found in index :  %d%n ", counter, index);
            }

        }
    }
}
