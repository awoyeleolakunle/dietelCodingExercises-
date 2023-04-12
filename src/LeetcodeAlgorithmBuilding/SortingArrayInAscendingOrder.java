package LeetcodeAlgorithmBuilding;

import TurTle.Turtle;

import java.util.Arrays;

public class SortingArrayInAscendingOrder {

    public static void main(String[] args) {

        Turtle objectOfClassTurtle = new Turtle();
        objectOfClassTurtle.moveForward(5);
        int [] arrayOfNum = {1,2,3,4};
        int arrayOFNum2[] = {3,4,5,6};
        int [] mergedArray = new int[arrayOFNum2.length+arrayOFNum2.length];

        for (int i = 0; i <arrayOfNum.length ; i++) {
            mergedArray[i] = arrayOfNum[i];
        }
        int n= arrayOfNum.length;
        for (int i = 0; i <arrayOFNum2.length ; i++) {
            mergedArray[n] =arrayOFNum2[i];
            n++;
        }
        System.out.println(Arrays.toString(mergedArray));

        int[] array = {4, 6, 2, 5, 2, 9};
        int copy = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] < array[i]) {
                    copy = array[i];
                    array[i] = array[j];
                    array[j] = copy;
                }
            }
        }
        System.out.println(Arrays.toString(array));
            int k =0;
        int newArray[] = new int[array.length];
        for (int i = array.length-1; i >=0 ; i--) {
            newArray[k] = array[i];
            k++;
        }
        System.out.println(Arrays.toString(newArray));
    }
}
