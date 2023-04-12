package Chapter14;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDob {

    public static void main(String[] args) {
        System.out.println(dobRegex("01-05-1970"));
    }
    private static String dobRegex(String userInput){

        Pattern pattern = Pattern.compile("[0-9]+\\W[0-5]+\\W[0-9]+");
        Matcher matcher = pattern.matcher(userInput);
        System.out.println(matcher.matches());

        var outPut = userInput.split("\\W");
        System.out.println(Arrays.toString(outPut));

        switch (Integer.parseInt(outPut[1])){

            case 5 -> {
                return String.valueOf(outPut[0]+" "+"May"+" "+outPut[2]);
            }
        }
        return "yes";
    }
}
