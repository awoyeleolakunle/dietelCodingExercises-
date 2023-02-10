package HolidayAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class CardValidator {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int fourteenthDoubled;
        int TwelvethDoubled;
        int tenthDouble;
        int eighthDoubled;
        int sixthDoubled;
        int fourthDouble;
        int secondDoubled;
        int zeroDoubled;
        int newfourteenthDoubled;
        System.out.println("enter number");
        String userInput = scanner.next();
        int[] cardNumber = new int[16];
        int newNumber = 0;
        int []newchar= new int[16];
        for (int i = 0; i <= newNumber&&i<16 ; i++) {

            try {
                newchar[i] = Character.getNumericValue(userInput.charAt(i));
                ++newNumber;
            }catch (StringIndexOutOfBoundsException e){
                lines();
            }
        }
        if (newNumber < 16) {
            System.out.printf("**Credit card Type :  Invalid Card%n**Credit Card Number : %s%n**Credit card digit length : %d%n**Validity Status : Invalid%n", userInput, newNumber);
            lines();
        }

        else{

            for (int index = 0; index < cardNumber.length; index++) {
                cardNumber[index] = Character.getNumericValue(userInput.charAt(index));
            }

            fourteenthDoubled = cardNumber[14] * 2;
            if (fourteenthDoubled > 9) {
                int firstNumberOfFourteenthDoubled = fourteenthDoubled / 10;
                int secondNumberOffourteenthDoubled = fourteenthDoubled % 10;
                fourteenthDoubled = firstNumberOfFourteenthDoubled + secondNumberOffourteenthDoubled;
            }
            TwelvethDoubled = cardNumber[12] * 2;
            if (TwelvethDoubled > 9) {
                int firstNumberOfTwelvethDoubled = TwelvethDoubled / 10;
                int secondNumberOfTwelvethDoubled = TwelvethDoubled % 10;
                TwelvethDoubled = firstNumberOfTwelvethDoubled + secondNumberOfTwelvethDoubled;
            }
            tenthDouble = cardNumber[10] * 2;
            if (tenthDouble > 9) {
                int firstNumberOfTenthDoubled = tenthDouble / 10;
                int secondNumberOfTenthDoubled = TwelvethDoubled % 10;
                TwelvethDoubled = firstNumberOfTenthDoubled + secondNumberOfTenthDoubled;
            }
            eighthDoubled = cardNumber[8] * 2;
            if (eighthDoubled > 9) {
                int firstNumberOfEightDoubled = eighthDoubled / 10;
                int secondNumberOfEighthDoubled = eighthDoubled % 10;
                eighthDoubled = firstNumberOfEightDoubled + secondNumberOfEighthDoubled;
            }
            sixthDoubled = cardNumber[6] * 2;
            if (sixthDoubled > 9) {
                int firstNumberOfSixthDoubled = sixthDoubled / 10;
                int secondNumberOfSixthDoubled = sixthDoubled % 10;
                sixthDoubled = firstNumberOfSixthDoubled + secondNumberOfSixthDoubled;
            }
            fourthDouble = cardNumber[4] * 2;
            if (fourthDouble > 9) {
                int firstNumberOfFourthDoubled = fourthDouble / 10;
                int secondNumberOfFourthDoubled = fourthDouble % 10;
                fourthDouble = firstNumberOfFourthDoubled + secondNumberOfFourthDoubled;
            }
            secondDoubled = cardNumber[2] * 2;
            if (secondDoubled > 9) {
                int firstNumberOfSecondDoubled = secondDoubled / 10;
                int secondNumberOfSecondDoubled = secondDoubled % 10;
                secondDoubled = firstNumberOfSecondDoubled + secondNumberOfSecondDoubled;
            }
            zeroDoubled = cardNumber[0] * 2;
            if (zeroDoubled > 9) {
                int firstNumberOfZerDoubled = zeroDoubled / 10;
                int secondNumberOfZeroDoubled = zeroDoubled % 10;
                zeroDoubled = firstNumberOfZerDoubled + secondNumberOfZeroDoubled;
            }


            int sumOfDoubled = fourteenthDoubled + TwelvethDoubled + tenthDouble + eighthDoubled + sixthDoubled + fourthDouble + secondDoubled + zeroDoubled;
            int sumOfNumbersInOddPosition = cardNumber[15] + cardNumber[13] + cardNumber[11] + cardNumber[9] + cardNumber[7] + cardNumber[5] + cardNumber[3] + cardNumber[1];

            int sumOfAllDoubledInEvenAndOddPosition = sumOfDoubled + sumOfNumbersInOddPosition;

            if (cardNumber[0] == 4 && sumOfAllDoubledInEvenAndOddPosition % 10 == 0) {
                lines();
                System.out.printf("**Credit card Type :  VISA CARD%n**Credit Card Number : %s%n**Credit card digit length : %d%n**Credit Card Validity Status : Valid%n", userInput, cardNumber.length);
                lines();
            } else if (cardNumber[0] == 4 && sumOfAllDoubledInEvenAndOddPosition % 10 != 0) {
                lines();
                System.out.printf("**Credit card Type :  VISA CARD%n**Credit Card Number : %s%n**Credit card digit length : %d%n**Credit Validity Status : Invalid%n", userInput, cardNumber.length);
                lines();
            } else if (cardNumber[0] == 5 && sumOfAllDoubledInEvenAndOddPosition % 10 == 0) {
                lines();
                System.out.printf("**Credit card Type :  MasterCARD%n**Credit Card Number : %s%n**Credit card digit length : %d%n**Validity Status : Valid%n", userInput, cardNumber.length);
                lines();
            } else if (cardNumber[0] == 5 && sumOfAllDoubledInEvenAndOddPosition % 10 != 0) {
                lines();
                System.out.printf("**Credit card Type :  MasterCARD%n**Credit Card Number : %s%n**Credit card digit length : %d%n**Validity Status : Invalid%n", userInput, cardNumber.length);
                lines();
            } else if (cardNumber[0] == 3 && cardNumber[1] == 7 && sumOfAllDoubledInEvenAndOddPosition % 10 == 0) {
                lines();
                System.out.printf("**Credit card Type :  AmericanExpressCard %n**Credit Card Number : %s%n**Credit card digit length : %d%n**Validity Status : Valid%n", userInput, cardNumber.length);
                lines();
            } else if (cardNumber[0] == 3 && cardNumber[1] == 7 && sumOfAllDoubledInEvenAndOddPosition % 10 != 0) {
                lines();
                System.out.printf("**Credit card Type :  AmericanExpressCard%n**Credit Card Number : %s%n**Credit card digit length : %d%n**Validity Status : Invalid%n", userInput, cardNumber.length);
                lines();
            } else if (cardNumber[0] == 6 && sumOfAllDoubledInEvenAndOddPosition % 10 == 0) {
                lines();
                System.out.printf("**Credit card Type :  DiscoveryCard%n**Credit Card Number : %s%n**Credit card digit length : %d%n**Validity Status : Valid%n", userInput, cardNumber.length);
                lines();
            } else if (cardNumber[0] == 6 && sumOfAllDoubledInEvenAndOddPosition % 10 != 0) {
                lines();
                System.out.printf("**Credit card Type :  DiscoveryCard%n**Credit Card Number : %s%n**Credit card digit length : %d%n**Validity Status : Valid%n", userInput, cardNumber.length);
                lines();
            }
        }
    }
        private static void lines () {
            System.out.println("****************************************");
        }
    }




