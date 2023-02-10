package HolidayAssignment;

import java.util.Arrays;
import java.util.Collections;

public class StudentGradesAssignment {
    protected String courseTitle;
    protected int[][] grades;

    public StudentGradesAssignment(String courseTitle, int[][] grades) {
        this.courseTitle = courseTitle;
        this.grades = grades;
    }

    public void setCourse(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public int getAverageScore(int[] grade) {
        int total = 0;
        //int average = 0;
        for (int courseScore : grade) {
            total += courseScore;
        }
        //average = total / grade.length;
        return total / grade.length;
    }

    public int getTotalScores(int[] grade) {
        int total = 0;
        for (int score : grade) {
            total += score;
        }
        return total;
    }

    public void showResult() {

        for (int course = 0; course < grades[0].length; course++) {
            System.out.printf("            course %d", course + 1);
        }
        System.out.print("                Total  ");
        System.out.print("      Average");
        System.out.print("        Position");

        System.out.println();
        for (int student = 0; student < grades.length; student++) {

            System.out.printf("student %d ", student + 1);
            for (int scores : grades[student]) {

                System.out.printf("    %d%s", scores, "                 ");
            }
            System.out.printf("  %d", getTotalScores(grades[student]));
            System.out.printf("         %d", getAverageScore(grades[student]));
            Integer[] totalScore = new Integer[grades.length];
            for (int i = 0; i < totalScore.length; i++) {
                totalScore[i] = getTotalScores(grades[i]);
            }

            Arrays.sort(totalScore, Collections.reverseOrder());
            System.out.printf("             %s%n", Arrays.asList(totalScore).indexOf(getTotalScores(grades[student])) + 1);
            System.out.println();
        }
    }

    public String highestScoreInAllSubject() {
        int highestScore = grades[0][0];
        for (int[] grade : grades) {
            for (int score : grade) {
                for (int i = 0; i < grade.length; i++) {
                    if (grade[i] > highestScore)
                        highestScore = grade[i];
                }

            }
        }
        return ("the highest score in all subjects is " + highestScore);

    }

    public void highestScorePerSubject() {
        int highestscorePerSubject = 0;
        for (int[] grade : grades) {
            for (int student = 0; student < grade.length; student++) {
                highestscorePerSubject = grades[student][0];
                    for (int j = 0; j < grades.length; j++) {
                        if (grade[j] > highestscorePerSubject) {
                            grade[j] = highestscorePerSubject;
                            System.out.printf("the highest score in subject%d is%d%n ", j+1, highestscorePerSubject);
                        }

                    }

                }

        };
    }
}



