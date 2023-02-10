package chapterThree;

import java.util.Scanner;

public class PetrolFuel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome our darling customer\n How many litres of fuel would you love to buy");
        int litres = scanner.nextInt();
        Petrol yinka = new Petrol("Sabo, Yaba", "Petrol", litres, 100 );
        System.out.println("your purchase amount before discount is : "+ yinka.getQuantityInLitres() * yinka.getPricePerLitre() + "\nYour purchaseAmount after discount is :  " + yinka.netPurchaseAmount());
        System.out.println(yinka.toLine());
    }
}
