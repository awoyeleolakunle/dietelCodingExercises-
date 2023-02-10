package Chapter5;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int firstNumber = scanner.nextInt();
        System.out.println("enter second number");
        int secondNumber = scanner.nextInt();
        int power = firstNumber;
        if (secondNumber < 0) specialNegativeExponentialCase(firstNumber, secondNumber);

        for (int i = 1; i < secondNumber; i++) {
            power *= firstNumber;
        }
        System.out.println(power);

    }
    private static void specialNegativeExponentialCase(int firstNumber, int secondNumber){
        int result = 1;
        secondNumber*=-1;
        //for(int i = 0; i<secondNumber; i++){
        for(int i = secondNumber; i<0; i++)
            result*=firstNumber;
           // double res =1/(double) result;
            //System.out.println(res);
            System.out.println(1 + "/" + result);
        }

    }
