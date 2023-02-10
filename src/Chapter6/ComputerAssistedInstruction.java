package Chapter6;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class ComputerAssistedInstruction {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        Random randomResponse= new Random();

        int number1;
        int number2;
        int counter = 0;

        int result = 0;
        int response = 1;

        while (response != 0) {
            number1 = 1 + randomNumber.nextInt(8);
            number2 = 1 + randomNumber.nextInt(8);
            result = number1 * number2;
            System.out.println("how much is " + number1 + " times " + number2 +    "   >>>>>  To quit, press 0  <<<<<");
            response = scanner.nextInt();
            if (response == result) {
                int positiveResponse = 1 + randomResponse.nextInt(4);
                switch (positiveResponse) {
                    case 1: {
                        System.out.println(" very Good! ");
                    }break;
                    case 2: {
                        System.out.println(" Exellenct! ");
                    }break;
                    case 3: {
                        System.out.println(" Nice Work");
                    }break;
                    case 4: {
                        System.out.println(" keep Up The Good Work ");
                    }break;
                }
            }
            else {
                while (response != result && response !=0) {
                    int negativeResponses = 1 + randomResponse.nextInt(4);
                    switch (negativeResponses){
                        case 1: {
                            System.out.println(" No Please Try Again ");
                        }break;
                        case 2: {
                            System.out.println(" Wrong. Try once more");
                        }break;
                        case 3: {
                            System.out.println(" Don't give up");
                        }break;
                        case 4: {
                            System.out.println("No. keep trying");
                        }break;
                    }
                    result = number1 * number2;
                    System.out.println("how much is " + number1 + " times " + number2 +  "  >>>>>  To quit, press 0  <<<<<");
                    response = scanner.nextInt();
                    if (response == result) {
                        System.out.println(" very good ");

                    }

                }
            }
        }
    }
}
