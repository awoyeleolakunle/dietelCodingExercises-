package Chapter6;


import chapterThree.Welcome;

import java.util.Locale;

public class BeautifyingString {
    public static void main(String[] args) {
        String beautifiedWord = showBeautifiedWord("jerry");
        System.out.println(beautifiedWord);
    }

    private static String beautifyString(String word) {
        for (int i = word.length(); i > 0; i -= word.length() - 1) {
            char newWord = word.charAt(i-1);
            if (newWord != '.')
                word += ".";
        }
        return word;
    }

    private static String capitalisingFirstLetter(String word) {

        char firstLetter = (word.charAt(0));
        char capitalFirstLetter = Character.toUpperCase(firstLetter);
        return word.replace(word.charAt(0), capitalFirstLetter);

    }
    private static String showBeautifiedWord(String word){

       String beautifiedWord = capitalisingFirstLetter(  beautifyString(word));
        return beautifiedWord;
    }
}

