package Chapter4;

import java.util.Scanner;

public class DistanceExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your coordinate " );
        int x1= scanner.nextInt();
        int x2 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int y2 = scanner.nextByte();
        System.out.println(x1+ " " +x2 + " " +y1 + " "+ y2);
        System.out.println(isPerpendicular(x1,x2,y1,y2));


    }

    public static boolean isPerpendicular(int x1, int x2, int y1, int y2) {
       //boolean isLineWithSamePointOnEitherAxis=x1==x2||y1==y2;
        //boolean isLineWithSlope = (x1==x2&&y1==y2);
        //if(isLineWithSamePointOnEitherAxis && !isLineWithSlope) return true;
       // return false
        if  (x1==x2&&y1==y2){
            return false;
        } else if (!(x1 == x2 || y1 == y2)) {
            return true;
        }

        return false;
    }
}