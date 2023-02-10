package HolidayAssignment;

public class StudentGradeRe {

    private static int [][] studentGrades;
    private static int []students;
    private String studentName;
    private static int studentsCount =1;
    private static int studentNumber;
    private static int[] grades;


    public StudentGradeRe( int [][] studentGrades){
        this.studentGrades = studentGrades;
        this.studentName = studentName;
        this.students = students;
        this.grades = grades;
        this.studentNumber = studentsCount;
        studentsCount++;

    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public static int[] getStudents() {
        return students;
    }

    public static int getStudentNumber() {
        return studentNumber;
    }

    public static int[] getGrades() {
        return grades;
    }
}
