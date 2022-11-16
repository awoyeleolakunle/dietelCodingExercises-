package AfterClassPractice;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {
    String fufu = "fufu";
    String rice = "rice";
    String yam = "yam";
    String yes = "yes";

        System.out.println("Welcome our dear customer");
        System.out.println();

        System.out.println("We have these follwoing food items");
        System.out.println("Rice");
        System.out.println("yam");
        System.out.println("Fufu");

        Scanner input = new Scanner(System.in);
        System.out.println(" please place your first food order:  ");
        String firstFoodOrder = input.nextLine();

        if (firstFoodOrder.equals(fufu))
            System.out.println("a plate of fufu is 500.00");
        if (firstFoodOrder.equals(rice))
            System.out.println("a plate of rice is 750.00");
        if (firstFoodOrder.equals(yam))
            System.out.println("a plate of yam is 500");

        Scanner secondorder = new Scanner(System.in);
        System.out.println( "will you love to make extra order ?");
        String response = secondorder.nextLine();
        if (response.equals(yes))
        System.out.println("please place your second order");
        else {
            System.out.printf("your only order is " + firstFoodOrder);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println( "please place your second order");
        String secondFoodOrder = scanner.nextLine();

        if (secondFoodOrder.equals(yam)) System.out.println("a plate of yam is 500.00");


        if (secondFoodOrder.equals(fufu)) System.out.println("a plate of fufu is 500.00");


        if (secondFoodOrder.equals("rice")) System.out.println("a plate of rice is 750.00");




        }




    }








