package Chapter5;

import java.util.Scanner;

public class Nevaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        double number = scanner.nextDouble();
        double sum =0;
        double count = 1;
        double numerator=1;
        double denominator=1;
       // for (float i=2; i < number; i++) {
        while ( count <= number){
            sum += (1 / count);
            denominator*=count;
            numerator*= (denominator/count);
            count+=1;

        }
        System.out.println(sum);
        System.out.println(denominator);
        System.out.println(numerator);

    }
}
