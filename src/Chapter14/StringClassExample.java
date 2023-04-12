package Chapter14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringClassExample {

    public static void main(String[] args) {
        String name = "Blessing";
        String tempValue = name;
        name+="favour";

        System.out.println(name);
        System.out.println(tempValue);

        StringBuilder springBuilder = new StringBuilder("Favour");
        StringBuilder newBuilder = springBuilder;

        System.out.println(newBuilder);
        System.out.println(springBuilder);

        StringBuilder newestBul = new StringBuilder(10);
        newestBul.append("OluwaSeunMI");
        System.out.println(newestBul.capacity());
        newestBul.append("OluwaSeunMIOpe");

        System.out.println(newestBul);

        String word = "HelloWorld";


String userInput = "email@gmail.com";
        System.out.println(userInput.matches("[a-z]+@[a-z]+\\.[a-z]{2,}"));

        System.out.println(Pattern.matches("[a-z]+@[a-z]+\\.[a-z]{2,}", userInput));

        Pattern pattern = Pattern.compile("[[a-z]+@[a-z]+\\.[a-z]{2,}]{6,}");
Matcher matcher = pattern.matcher(userInput);
        System.out.println(matcher.matches());

    }
}
