package Practices;

import java.security.SecureRandom;
import java.util.Arrays;

public class LetPracticeArrayAgain {
    public static void main(String[] args) {

        SecureRandom randomNumber = new SecureRandom();
        int frequency[] = new int[7];
        for (int index = 0; index < 100; index++) {
            ++frequency[ 1 + randomNumber.nextInt(6)];
        }
            for (int face = 1; face < frequency.length; face++) {
                System.out.println(face + " " + frequency[face]);

            }
        }
    }
