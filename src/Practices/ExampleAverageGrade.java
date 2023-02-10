package Practices;

import java.util.Scanner;

public class ExampleAverageGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AverageGrade gradeScores = new AverageGrade();
        int sum = 0;
        int gradeCounter = 1;
        while (gradeCounter <= 10) {
            System.out.println(" enter "  + gradeScores.gradelevel(gradeCounter));
            int grade = input.nextInt();
            sum = sum + grade;
            gradeCounter += 1;
        }
        int average = sum / 10;

        System.out.printf(" %nTotal of all grades is %d%n  ", sum);
        System.out.printf("%nAverage grade is  %d%n  ", average);
    }


    }
