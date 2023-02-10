package Practices;

import java.util.Scanner;

public class AnagramLeetCodeChallenge {
    public static void main(String[] args) {
        String word = "anagram";
        char[] word1 = word.toCharArray();
        String[] toFind = new String[word1.length];
        Scanner scanner = new Scanner(System.in);

        for (char each : (word1)) {
            for (int i = 0; i < word1[i]; i++) {
                System.out.println("enter the word you what to compare ");
                toFind[i] = scanner.next();

                if (word1[each] == toFind[each].charAt(i)) {
                    //if (toFind.equals(word)){
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }

            }

        }

        // toFind[i] = scanner.nextLine();

        //for (int j = 0; j < toFind.length ; j++) {
        //      if ((word.charAt(j))==((toFind[i].charAt(j)))){
        //        System.out.println("True");}
        //  else {
        //    System.out.println("False");
        //}


    }
}
