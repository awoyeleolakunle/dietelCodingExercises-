package Chapter4;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "enter a number");
        int firstUserInput = input.nextInt();
        System.out.println("enter second number");
        int secondUserInput = input.nextInt();
        if (firstUserInput == secondUserInput){
            System.out.println(0);}
        if(firstUserInput > secondUserInput){
            System.out.println(1);}
        if (secondUserInput > firstUserInput){
            System.out.println(-1);}
    }
}

