package HolidayAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class CheckOutApp {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<String> item1 = new ArrayList<>();
        ArrayList<Double> price1 = new ArrayList<>();
        ArrayList<Integer> quantity1 = new ArrayList<>();
        ArrayList<Double> total1 = new ArrayList<>();
        ArrayList<Double> subTotal1 = new ArrayList<>();


        String moreOrder = null;
        String name = null;
        String itemName = null;
        int quantity = 0;
        double price = 0;
        double subTotal = 0;
        double discount = 0;
        double vat = 0;
        double billTotal = 0;
        double amountPaid = 0;
        double balance = 0;
        String[] address = {"SEMICOLON STORES", "MAIN BRANCH", "LOCATION: 312, HERBERT MACAULAY WAY, SABO, YABA, LAGOS", "TEL : 03293828343"};
        System.out.println("what is the customer's name");
        name = scanner.next();
        do {

            System.out.println("what did the user buy");
            itemName = scanner.next();
            item1.add(itemName);
            System.out.println("how many pieces");
            quantity = scanner.nextInt();
            quantity1.add(quantity);
            System.out.println("how much per unit");
            price = scanner.nextInt();
            price1.add(price);
            total1.add(price * quantity);
            subTotal += price * quantity;

            System.out.println("add more items");
            moreOrder = scanner.next();

        } while (moreOrder.equalsIgnoreCase("yes"));

            System.out.println(" what is your name");
            String cashierName = scanner.next();
            System.out.println("how much discount will he get");

        discount = scanner.nextDouble();

        discount = (discount / 100) * subTotal;
        vat = (17.50 / 100) * subTotal;
        billTotal = (subTotal - discount) + vat;
        for (String details : address) {
            System.out.println(details);
        }
        Date date = new Date();
        System.out.println(date);
        System.out.println("Cashier's Name :  " + cashierName);
        System.out.println("customer's Name : " + name);

            System.out.println("""
                     ===================================================================
                             ITEM            QTY         PRICE               TOTAL(NGN)
                     -------------------------------------------------------------------         
                             """);
        for (int i = 0; i <item1.size() ; i++) {
            System.out.print("          " + item1.get(i));
            System.out.print("          " + quantity1.get(i));
            System.out.print("          " + price1.get(i));
            System.out.print("               " + total1.get(i));
            System.out.println();
        }

            System.out.println("   -----------------------------------------------------------------");
            System.out.printf("%25s Sub Total:%25s%n %25s  Discount:%25s%n %25s  VAT @ 17.50:%22.2f%n  ", "", subTotal, "", discount, "", vat);
            System.out.println("===================================================================");
            System.out.printf("%25s Bill Total :  %20s%n ", "", billTotal);
            System.out.println(" ===================================================================");
            System.out.println(" THIS IS NOT A RECEIPT KINDLY PAY " + billTotal);
            System.out.println("  ===================================================================");

            System.out.println("How much did the customer give you");
            amountPaid = scanner.nextDouble();
            balance = amountPaid - billTotal;
            for (String details : address) {
                System.out.println(details);
            }
            System.out.println(date);
            System.out.println("Cashier's Name :  " + cashierName);
            System.out.println("customer's Name : " + name);
            System.out.println("""
                    ===================================================================
                             ITEM            QTY         PRICE               TOTAL(NGN)
                    -------------------------------------------------------------------         
                             """);

        for (int i = 0; i <item1.size() ; i++) {
            System.out.print("          " + item1.get(i));
            System.out.print("          " + quantity1.get(i));
            System.out.print("          " + price1.get(i));
            System.out.print("               " + total1.get(i));
            System.out.println();
        }

        System.out.println("-------------------------------------------------------------------");
            System.out.printf(" %25s Sub Total:%25s%n %25s Discount:%25s%n %25s VAT @ 17.50:%22.2f%n ", "", subTotal, "", discount, "", vat);
            System.out.println("===================================================================");
            System.out.printf("  %25s Bill Total :%20s%n %25s Amount Paid :%25s%n %25s Balance :%25s%n", "", billTotal, "", amountPaid, "", balance);
            System.out.println("===================================================================");
            System.out.println(" Thank YOU FOR YOUR PATRONAGE ");

        }
    }

