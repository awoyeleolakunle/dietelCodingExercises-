package Practices;

import java.util.Scanner;

public class ExampleAverageGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 1;
        while (gradeCounter <=10) {
            System.out.println("enter grade: ");
            int grade = input.nextInt();
            total = total + grade;
            gradeCounter += 1;
        }
        int average = total / 10;

        System.out.printf(" %nTotal of all grades is %d%n  ", total);
        System.out.printf("%nAverage grade is  %d%n  " , average);
    }
}
