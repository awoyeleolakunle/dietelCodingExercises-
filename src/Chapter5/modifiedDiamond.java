package Chapter5;

import java.util.Scanner;

public class modifiedDiamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number of blocks for your diamond ranging between odd numbers of 1 and 19");
        int userInput = input.nextInt();

        int blank = (userInput-1)/2;
        for(int i=1; i<userInput; i+=2){
            for (int j = 0; j<blank ; j++){
                System.out.print(" ");
            }
            for(int j =1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
            blank--;
        }
        blank=1;
        for (int i =userInput-2; i>0; i-=2){
            for(int j = 0; j< blank; j++){
                System.out.print(" ");

            }
            for (int j =i; j>0;j--){
                System.out.print("*");
            }
            System.out.println();
            blank++;

        }
    }
}
