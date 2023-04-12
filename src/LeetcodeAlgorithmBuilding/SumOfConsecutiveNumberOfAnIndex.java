package LeetcodeAlgorithmBuilding;

import java.util.ArrayList;

public class SumOfConsecutiveNumberOfAnIndex {
    public static void main(String[] args) {

       int result = indexOfSumOfConsecutiveNumbers(4, 14, 3);
       System.out.println(result);
    }
    public static int indexOfSumOfConsecutiveNumbers(int num1, int num2, int num3){
        int [] array= {num1,num2,num3};
        int k= array[1]/array[0];
        int a = num1-2;
        ArrayList <Integer>list = new ArrayList();
        list.add(k-1);
        list.add(k);
        for (int i = 0; i <a; i++) {
            k+=1;
            list.add(k);
        }
        int result = array[array.length-1];
       return list.get(result);}
}
