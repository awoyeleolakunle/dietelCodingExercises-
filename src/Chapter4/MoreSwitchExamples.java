package Chapter4;

import java.util.Scanner;

public class MoreSwitchExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1. 2000
                2. 5000
                3.10000
                4.15000
                5.20000
                6. other amount
                """);
        System.out.println("pick an option");
        int input = scanner.nextInt();
        switch (input){
            case 1:
                System.out.println("take your 2k");
                break;
            case 2:
                System.out.println("take your 5k");
                break;
            case 3:
                System.out.println("pick your 10k");
            default:
                System.out.println("money don finish");
                break;
            case 4:
                System.out.println("pick your 15k");
                break;
            case 5:
                System.out.println("pick your 20k");
            case 6: {
                System.out.println("enter amount: ");
                String amount = scanner.next();
                handleOtherAmount(amount);
                System.out.println("take your " + amount + "k");
            }
                break;

        }

    }

    private static void handleOtherAmount(String amount) {

    }
}
