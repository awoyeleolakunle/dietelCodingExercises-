package HolidayAssignment;

import java.util.Scanner;

public class CreditCardValidator {
    private static final Scanner scanner = new Scanner(System.in);
    private int[] cardNumber;
    public static void main(String[] args) {
        int totalEven =0;
        int sumOfOdd =0;
        System.out.println("enter your credit card number");
        String userInput = scanner.next();
        int[] cardNumber = new int[userInput.length()];

        lines();
        for (int index = 0; index < userInput.length(); index++) {
            cardNumber[index] = Character.getNumericValue(userInput.charAt(index));
        }

        for (int i = userInput.length()-2 ; i >0; i -= 2) {
            int doubledNumber = cardNumber[i] * 2;
            if (doubledNumber > 9) {
                doubledNumber = (doubledNumber / 10) + (doubledNumber % 10);
            }
            totalEven += doubledNumber;
        }
        for (int i = userInput.length()-1; i >0 ; i-=2) {
             sumOfOdd+= cardNumber[i];
        }

            int sumOfAllDoubledInEvenAndOddPosition = totalEven + sumOfOdd;

            if (cardNumber[0] == 4 && sumOfAllDoubledInEvenAndOddPosition % 10 == 0) {
                lines();
                System.out.printf("**Credit card Type :  VISA CARD%n**Credit Card Number : %s%n**Credit card digit length :" +
                        " %d%n**Credit Card Validity Status : Valid%n", userInput, userInput.length());
                lines();
            } else if (cardNumber[0] == 4) {
                lines();
                System.out.printf("**Credit card Type :  VISA CARD%n**Credit Card Number : %s%n**Credit card digit length : " +
                        "%d%n**Credit Validity Status : Invalid%n", userInput, userInput.length());
                lines();
            } else if (cardNumber[0] == 5 && sumOfAllDoubledInEvenAndOddPosition % 10 == 0) {
                lines();
                System.out.printf("**Credit card Type :  MasterCARD%n**Credit Card Number : %s%n**Credit card digit length : " +
                        "%d%n**Validity Status : Valid%n", userInput, userInput.length());
                lines();
            } else if (cardNumber[0] == 5) {
                lines();
                System.out.printf("**Credit card Type :  MasterCARD%n**Credit Card Number : %s%n**Credit card digit length :" +
                        " %d%n**Validity Status : Invalid%n", userInput, userInput.length());
                lines();
            } else if (cardNumber[0] == 3 && cardNumber[1] == 7 && sumOfAllDoubledInEvenAndOddPosition % 10 == 0) {
                lines();
                System.out.printf("**Credit card Type :  AmericanExpressCard %n**Credit Card Number : %s%n**Credit card digit length : " +
                        "%d%n**Validity Status : Valid%n", userInput, userInput.length());
                lines();
            } else if (cardNumber[0] == 3 && cardNumber[1] == 7) {
                lines();
                System.out.printf("**Credit card Type :  AmericanExpressCard%n**Credit Card Number : %s%n**Credit card digit length : " +
                        "%d%n**Validity Status : Invalid%n", userInput, userInput.length());
                lines();
            } else if (cardNumber[0] == 6 && sumOfAllDoubledInEvenAndOddPosition % 10 == 0) {
                lines();
                System.out.printf("**Credit card Type :  DiscoveryCard%n**Credit Card Number : %s%n**Credit card digit length : " +
                        "%d%n**Validity Status : Valid%n", userInput, userInput.length());
                lines();
            } else if (cardNumber[0] == 6) {
                lines();
                System.out.printf("**Credit card Type :  DiscoveryCard%n**Credit Card Number : %s%n**Credit card digit length : " +
                        "%d%n**Validity Status : Valid%n", userInput, userInput.length());
                lines();
            }
                else{  System.out.printf("**Credit card Type :  InvalidCard%n**Credit Card Number : %s%n**Credit card digit length : " +
                    "%d%n**Validity Status : Invalid%n", userInput, userInput.length());
            }
        }
        private static void lines () {
            System.out.println("****************************************");
        }
    }




