package Practices;

import java.util.Scanner;

public class GradePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gradecounter = 0;
        int totalGrade = 0;
        System.out.println("enter grade: ");
        int grade = input.nextInt();
        while (grade != 0) {
            totalGrade = totalGrade + grade;
            gradecounter = gradecounter + 1;
            System.out.println("enter grade or 0 to quit ");
            grade = input.nextInt();
        }

        int average = 0;
        if (gradecounter != 0) {
            average = totalGrade / gradecounter;
        }

        System.out.printf("%n average grade so far is %d%n ", average);
        grade = input.nextInt();
    }

}
