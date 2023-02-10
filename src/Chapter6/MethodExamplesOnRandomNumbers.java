package Chapter6;

import java.security.SecureRandom;

public class MethodExamplesOnRandomNumbers {
    public static void main(String[] args) {
        //SecureRandom randomNumber = new SecureRandom();

        // for (int counter = 1; counter <= 20; counter++) {
        //int face = 1 + randomNumber.nextInt(6);
        // System.out.printf("%d ", face);
        //if (counter%5 ==0){
        //  System.out.println();}
        SecureRandom randomNumber = new SecureRandom();
        int frequency1 = 0;
        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;
        int frequency6 = 0;

        for (int count = 1; count < 60000000; count++) {
            int face = 1 + randomNumber.nextInt(6);
            if (face == 1) {
                ++frequency1;
            } else if (face == 2) {
                ++frequency2;
            } else if (face == 3) {
                ++frequency3;
            } else if (face == 4) {
                ++frequency4;
            } else if (face == 5) {
                ++frequency5;
            } else{
                ++frequency6;}

        }

        System.out.println("Face\tfrequency");
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", frequency1, frequency2, frequency3, frequency4, frequency5, frequency6);
    }

        }



