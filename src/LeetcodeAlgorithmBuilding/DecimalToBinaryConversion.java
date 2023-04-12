package LeetcodeAlgorithmBuilding;

import java.util.ArrayList;

public class DecimalToBinaryConversion {

    public static void main(String[] args) {
        decimalToBinaryConversion(325);

    }

    private static void decimalToBinaryConversion(int number) {
        ArrayList<Integer>listOfNumbers = new ArrayList<>();
        int newNumber ;
        do {
            newNumber = number%2;
            listOfNumbers.add(newNumber);
            number = number/2;
            if (number==1 ||number==0)
                listOfNumbers.add(number);
        } while (number!=0);

        for (int i = listOfNumbers.size()-3; i>=0 ; i--) {
            System.out.print(listOfNumbers.get(i));
        }

    }
}

