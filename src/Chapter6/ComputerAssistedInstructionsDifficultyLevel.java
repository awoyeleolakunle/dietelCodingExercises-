package Chapter6;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class ComputerAssistedInstructionsDifficultyLevel {
    private static Scanner scanner = new Scanner(System.in);
    private static SecureRandom randomNumber = new SecureRandom();

    public static void main(String[] args) {

        Random randomResponse = new Random();

        int number1;
        int number2;
        int counter = 0;

        int result = 0;
        int response = 0;
        double totalResponse = 0;
        double totalOfCorrectAnswers = 0;
        System.out.println(" You are welcome to student elememtary game of multiplication");
        System.out.println();
        System.out.println("""
                1. Press 1 for easy level
                2. press 2 for difficult level
                """);
        int userInput = scanner.nextInt();
        switch (userInput) {
            case 1: {

                while (totalResponse < 10) {
                    number1 = 1 + randomNumber.nextInt(8);
                    number2 = 1 + randomNumber.nextInt(8);
                    result = number1 * number2;
                    System.out.println("how much is " + number1 + " times " + number2);
                    response = scanner.nextInt();
                    if (response == result) {
                        totalResponse++;
                        totalOfCorrectAnswers++;
                        int positiveResponse = 1 + randomResponse.nextInt(4);
                        switch (positiveResponse) {
                            case 1: {
                                System.out.println(" very Good! ");
                            }
                            break;
                            case 2: {
                                System.out.println(" Exellenct! ");
                            }
                            break;
                            case 3: {
                                System.out.println(" Nice Work");
                            }
                            break;
                            case 4: {
                                System.out.println(" keep Up The Good Work ");
                            }
                            break;
                        }
                    } else {
                        while (response != result && totalResponse < 10) {
                            totalResponse++;
                            int negativeResponses = 1 + randomResponse.nextInt(4);
                            switch (negativeResponses) {
                                case 1: {
                                    System.out.println(" No Please Try Again ");
                                }
                                break;
                                case 2: {
                                    System.out.println(" Wrong. Try once more");
                                }
                                break;
                                case 3: {
                                    System.out.println(" Don't give up");
                                }
                                break;
                                case 4: {
                                    System.out.println("No. keep trying");
                                }
                                break;
                            }
                            result = number1 * number2;
                            System.out.println("how much is " + number1 + " times " + number2);
                            response = scanner.nextInt();
                            if (response == result && totalResponse < 10) {
                                System.out.println(" very good ");
                                totalResponse++;
                                totalOfCorrectAnswers++;
                            }
                        }
                    }
                }

                    System.out.println("Total number of answers given by the student is : " + totalResponse);
                    System.out.println("Total number of correct answers given by the student is : " + totalOfCorrectAnswers);
                    double percentage = (totalOfCorrectAnswers / totalResponse) * 100;
                    System.out.println("Total student result's percentage is : " + percentage + "%");
                    if (percentage >= 75) {
                        System.out.println(" Congratulations, you are ready to go to the next level!");
                    } else {
                        System.out.println("Please ask your teacher for extra help ");
                    }
                }

            break;
            case 2: {


                System.out.println(" welcome to  difficult Level ");


                while (totalResponse < 10) {
                    number1 = 1 + randomNumber.nextInt(10, 100);
                    number2 = 1 + randomNumber.nextInt(10, 100);
                    result = number1 * number2;
                    System.out.println("how much is " + number1 + " times " + number2);
                    response = scanner.nextInt();
                    if (response == result) {
                        totalResponse++;
                        totalOfCorrectAnswers++;
                        int positiveResponse = 1 + randomResponse.nextInt(4);
                        switch (positiveResponse) {
                            case 1: {
                                System.out.println(" very Good! ");
                            }
                            break;
                            case 2: {
                                System.out.println(" Excellent! ");
                            }
                            break;
                            case 3: {
                                System.out.println(" Nice Work");
                            }
                            break;
                            case 4: {
                                System.out.println(" keep Up The Good Work ");
                            }
                            break;
                        }
                    } else {
                        while (response != result && totalResponse < 10) {
                            totalResponse++;
                            int negativeResponses = 1 + randomResponse.nextInt(4);
                            switch (negativeResponses) {
                                case 1: {
                                    System.out.println(" No Please Try Again ");
                                }
                                break;
                                case 2: {
                                    System.out.println(" Wrong. Try once more");
                                }
                                break;
                                case 3: {
                                    System.out.println(" Don't give up");
                                }
                                break;
                                case 4: {
                                    System.out.println("No. keep trying");
                                }
                                break;
                            }
                            result = number1 * number2;
                            System.out.println("how much is " + number1 + " times " + number2);
                            response = scanner.nextInt();
                            if (response == result && totalResponse < 10) {
                                System.out.println(" very good ");
                                totalResponse++;
                                totalOfCorrectAnswers++;
                            }
                        }
                    }

                }
            }
                System.out.println("Total number of answers given by the student is : " + totalResponse);
                System.out.println("Total number of correct answers given by the student is : " + totalOfCorrectAnswers);
                double percentage = (totalOfCorrectAnswers / totalResponse) * 100;
                System.out.println("Total student result's percentage is : " + percentage + "%");
                if (percentage >= 75) {
                    System.out.println(" Congratulations, you are ready to go to the next level!");
                } else {
                    System.out.println("Please ask your teacher for extra help ");
                }
            }
        }
    }

