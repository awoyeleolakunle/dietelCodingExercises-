package HolidayAssignment;

import java.util.Scanner;

public class StudentGradesAnalysed {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(" how many stundents enrolled for the term");
        int numberOfStudent = scanner.nextInt();

        System.out.println("enter number of courses ");
        int numberOfCourses = scanner.nextInt();

        int [][] studentGrades = new int[numberOfStudent][numberOfCourses];
        StudentsAndGrades studentResult = new StudentsAndGrades(studentGrades);
        for (int student = 0; student < studentGrades.length ; student++) {
            for (int scores = 0; scores < studentGrades[0].length ; scores++) {
                System.out.printf("enter scores%d for student%d%n " ,scores+1, student+1);
                studentGrades[student][scores] = scanner.nextInt();

            }
        }
        studentResult.showResult();
        studentResult.showSummaryPerCourse();
    }
}