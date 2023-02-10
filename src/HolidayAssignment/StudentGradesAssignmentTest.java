package HolidayAssignment;

import java.util.Scanner;

public class StudentGradesAssignmentTest {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(" how many student enrolled for this term");
        int numberOfStudent = scanner.nextInt();
        System.out.println("how many courses were taken ? ");
        int numberOfCourses = scanner.nextInt();
        int [][] grades = new int [numberOfStudent][numberOfCourses];

        StudentGradesAssignment studentResult = new StudentGradesAssignment("First Term Result", grades);
        System.out.println();
        for (int student = 0; student < grades.length ; student++) {
            for (int scores = 0; scores <numberOfCourses ; scores++) {
                System.out.printf("enter scores%d for student%d%n " ,scores+1, student+1);
                grades[student][scores] = scanner.nextInt();

            }
            }
        System.out.println(studentResult.getCourseTitle());
        studentResult.showResult();
        System.out.println(studentResult.highestScoreInAllSubject());

    }
}
