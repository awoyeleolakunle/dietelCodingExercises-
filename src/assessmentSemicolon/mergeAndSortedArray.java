package assessmentSemicolon;

import java.util.Arrays;

public class mergeAndSortedArray {

    public static void main(String[] args) {
        int firstArr[] = {1, 3, 4, 5};
        int secondArr[] = {2, 6, 7, 8};
        mergedAndSortedArray(firstArr, secondArr);
    }


    private static void mergedAndSortedArray(int firstArr[], int secondArr[]) {


        int[] mergedArray = new int[firstArr.length + secondArr.length];

        for (int i = 0; i < firstArr.length; i++) {
            mergedArray[i] = firstArr[i];
        }
        int n = firstArr.length;
        for (int i = 0; i < secondArr.length; i++) {
            mergedArray[n] = secondArr[i];
            n++;
        }



        int copy = 0;
        for (int i = 0; i < mergedArray.length; i++) {
            for (int j = 0; j < mergedArray.length; j++) {
                if (mergedArray[j] < mergedArray[i]) {
                    copy = mergedArray[i];
                    mergedArray[i] = mergedArray[j];
                    mergedArray[j] = copy;
                }
            }
        }

        int k = 0;
        int newArray[] = new int[mergedArray.length];
        for (int i = mergedArray.length-1; i >=0 ; i--) {
            newArray[k] = mergedArray[i];
            k++;
        }
        System.out.println(Arrays.toString(newArray));
    }

}
