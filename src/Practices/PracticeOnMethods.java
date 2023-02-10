package Practices;

import com.sun.jdi.PathSearchingVirtualMachine;

import static java.lang.Math.abs;

public class PracticeOnMethods {
    public static void main(String[] args) {

        //double x = Math.sqrt(900);
         //System.out.println(x);
        // double y = (13.0+ 3.0) * 4.0;
        // System.out.println(y);
        // double z = Math.sqrt(y);
        // System.out.println(z);
        // double i = abs(-23.7);
        //System.out.println(i);
        int space = 10;
        for (int i = 1; i <= 9; i += 2) {
            for (int j = 0; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
                space--;
            }
        space=5;
        for(int i =0; i<=4;i+=3){
            for(int j=1; j<=space; j+=2){
                System.out.print(" ");
            }
            for(int j=1; j<=17;j++){
                System.out.print("*");
            }
            System.out.println();
            space+=0;
        }
         space = 5;
        for(int i=7; i>=1; i-=2){
            for(int j =1; j<=space; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
            space+=0;
        }
        }
    }
