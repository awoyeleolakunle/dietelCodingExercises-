package Practices;

import java.io.BufferedReader;
import java.util.Arrays;

public class AnalysingSurveyExampleWithArray {
    public static void main(String[] args) {
        int [] frequency = new int[6];

        int [] response = {1,2,5,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2,14};
        for (int index = 0; index < response.length ; index++) {
           try { ++frequency[response[index]];
        }
           catch(ArrayIndexOutOfBoundsException result){
               System.out.println(result);
           }
        }
        for (int i = 0; i < frequency.length ; i++) {
            System.out.println(i + " "+ frequency[i]);



        }
    }
}
