package Chapter5;

import java.util.Scanner;

public class GlobalWarmingFactQuiz {
    private static int totalResult;
    private static String answer;
    private static Scanner scanner = new Scanner(System.in);
    private static String response;
    private static String question;

    public static void main(String[] args) {


        displayQuestions();

    }

    private static void displayQuestions() {

        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0 -> {
                    questionOne();
                    takeResponse();
                    //takeResponse();
                }

                case 1 -> {
                    questionTwo();
                    takeResponse();
                }
                case 2 -> {
                    questionThree();
                    takeResponse();
                }
                case 3 -> {
                    questionFour();
                    takeResponse();
                }
                case 4 -> {
                    questionFive();
                    takeResponse();
                }
            }

        }
        System.out.println("The total of all correct answers is :  " + totalResult);
        showRemark();

    }

    private static void questionOne() {
        String question = "   Global warming can be controlled by ";
        answer = "b";
        System.out.println(question);
        String options = """
                A. Increasing deforestation, reducing efficiency of energy use.
                B. Reducing deforestation, cutting down use of fossil.
                C. Reducing deforestation, increasing use of fossil.
                D. Increasing deforestation, slowing down the growth of human population.
                """;
        System.out.println(options);
    }

    private static void questionTwo() {
        question = "   Global warming will cause";
        answer = "d";
        System.out.println(question);
        String option = """
                A. Rise in level of oceans
                B. Decrease in glaciers
                C. Reduction in ice caps
                D. All the above
                   """;
        System.out.println(option);
    }

    private static void questionThree() {
        question = "   Earth's temperatures are ";
        answer = "b";
        System.out.println();
        String option = """
                A. A cloud layer.
                B. An Atmosphere
                C. Gravity
                D. Water
                   """;
        System.out.println(option);
    }

    private static void questionFour() {
        question = "   This layer keeps us not too hot in the summer and not too cold in the winter. Scientists call this the _____";
        answer = "a";
        System.out.println(question);
        String option = """
                A. Greenhouse effect
                B. Seasonal effect
                C. Ocean effect
                D. Lake effect
                   """;
        System.out.println(option);
    }

    private static void questionFive() {
        question = "   The layer of the atmosphere closest to Earth is called the: _________ ";
        answer = "a";
        System.out.println(question);
        String option = """
                A. Troposphere.
                B. Stratosphere
                C. Exosphere
                D. Mesosphere
                   """;
        System.out.println(option);
    }

    private static void takeResponse() {

        response = scanner.next();
        if (response.equalsIgnoreCase(answer)) {
            ++totalResult;
        } else {
            while (!(response.equalsIgnoreCase("a")) || (!(response.equalsIgnoreCase("b")))
                    || (!(response.equalsIgnoreCase("c"))) || (!(response.equalsIgnoreCase("d")))) {
                System.err.println(" !!! please pick the correct option from A - D");
                System.out.println(question);
                response = scanner.next();
                if (response.equalsIgnoreCase(answer)) {
                    ++totalResult;
                }
            }

        }
    }
    private static void repeatQuestion() {

        int count = 0;

        }


        private static void showRemark(){
            switch (totalResult) {
                case (1) -> System.out.println(" Time to brush up on your knowledge of global warming ");
                case (2) -> System.out.println("Time to brush up on your knowledge of global warming ");
                case (3) -> System.out.println("Time to brush up on your knowledge of global warming");
                case (4) -> System.out.println("Very Good");
                case (5) -> System.out.println("Excellent");
            }

        }
        }

