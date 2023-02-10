package Practices;

public class ClassGradeTextBookExampleRetry {
    public static void main(String[] args) {

        int[] grade = {0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
        for (int index = 0; index < grade.length + 1; index++) {
            if (index == grade.length){
                System.out.println("garde score is " + 100);}
            else {
                System.out.println(index * 10 + "---" + (index * 10 + 9));
            }
            for (int star = 0; star < grade[index]; star++)
                System.out.print("*");
            }

        }

    }


