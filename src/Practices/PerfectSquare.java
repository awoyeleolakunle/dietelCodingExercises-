package Practices;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your char to fill");
        char fill = scanner.next().charAt(0);
        for (int row = 0; row <= 4; row++) {
            //System.out.print("*");
            for (int column = 0; column <=4; column++) {
                System.out.print(fill);

            }
            System.out.println();
        }
    }
}

