package HolidayAssignment;

public class StudentsAndGrades {

    private static int[][] studentsGrades;
    private static String studentName;
    //private static int[] grades;

    public StudentsAndGrades(int[][] studentsGrades) {
        StudentsAndGrades.studentsGrades = studentsGrades;
        studentName = studentName;
        //this.grades = grades;
    }

    public void showResult() {

        for (int course = 0; course < studentsGrades[0].length; course++) {
            System.out.printf("%8scourse%d%10s", "", course + 1, "");
        }

        System.out.printf("  %12s%14%14s%n", "TotalScore", "AverageScore", "Position");

        for (int student = 0; student < studentsGrades.length; student++) {
            System.out.printf("student%d", student + 1);
            for (int grades : studentsGrades[student]) {
                System.out.printf("%6d", grades);
            }
            System.out.printf("%8s%10s%n", getTotalPerStudent(studentsGrades[student]), getAverageForEachStudent(studentsGrades[student]));
        }

        System.out.println();

        System.out.println();
    }


    public int getAverageScorePerCourse(int score) {
        int total = 0;
        int averageScorePerCourse = 0;
        for (int studentScore = 0; studentScore < studentsGrades[0].length; studentScore++) {
            for (int[] grades : studentsGrades) {
                grades[studentScore] = score;
                total += score;
            }
            averageScorePerCourse = total / studentsGrades[0].length;


        }
        return averageScorePerCourse;
    }


    public int getAverageForEachStudent(int[] grades) {
        int total = 0;
        int averagePerEachStudent = 0;
        for (int grade : grades) {
            total += grade;
            averagePerEachStudent = total / grades.length;
        }
        return averagePerEachStudent;
    }

    public void showSummaryPerCourse() {
        //int highestScore = studentsGrades[0][0];
        for (int course = 0; course < studentsGrades[0].length; course++) {
            int highestScore = studentsGrades[course][0];
            int lowestScore = studentsGrades[course][0];
            int total = 0;

            for (int[] grades : studentsGrades) {
                if (grades[course] > highestScore)
                    highestScore = grades[course];
                if (grades[course] < lowestScore)
                    lowestScore = grades[course];
                total+=grades[course];
            }

            System.out.printf("highest score in course%d is %d%n", course + 1, highestScore);
            System.out.printf("lowest score in course%d is %d%n", course + 1, lowestScore);
            System.out.printf(" Total score is%d ", total  );
            System.out.println();
            System.out.println();
        }


    }

    public int getTotalPerStudent(int[] grades) {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total;
    }

    }



