package Chapter15.FileREADER;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferedWriterSample2 {
    public static void main(String[] args) {

        String[] words = {"QWERTY", "ASDFG", "ZXCVB", "POIUY", "LKJHG", "MNBVC"};
        BufferedWriter bufferedWriter = null;
        try {
            OutputStreamWriter writer =
                    new OutputStreamWriter(new FileOutputStream("C:\\Users\\ADMIN\\IdeaProjects\\javaProjects\\src\\Chapter15\\test3"));
            bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(words[0] + " " + words[3]+" ");
            bufferedWriter.flush();
            bufferedWriter.write(words[1]);
            bufferedWriter.flush();
            bufferedWriter.close();


        } catch (IOException exception) {
           System.err.println(exception.getMessage());
        } finally {
//            try {
//                bufferedWriter.close();
//            }catch(IOException e){
//                System.err.println(e.getMessage());
//            }
        }
    }
}
