package Practices;

public class AverageGrade {
    public String gradelevel(int gradeCounter) {
        if (gradeCounter == 1) {
            return "firstGrade";
        } else if (gradeCounter == 2) {
            return "secondGrade";
        } else if (gradeCounter == 3) {
            return "thirdGrade";
        } else if (gradeCounter == 4) {
            return "fourthGrade";
        } else if (gradeCounter == 5) {
            return "fifthGrade";
        } else if (gradeCounter == 6) {
            return "sixthGrade";
        } else if (gradeCounter == 7) {
            return "seventhGrade";
        } else if (gradeCounter == 8) {
            return "EighthGrade";
        } else if (gradeCounter == 9) {
            return "ninethGrade";
        } else {
            return "tenthGrade";
        }


    }

}