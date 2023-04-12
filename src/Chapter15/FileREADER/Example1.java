package Chapter15.FileREADER;

import java.io.FileWriter;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("C:\\Users\\ADMIN\\IdeaProjects\\javaProjects\\src\\Chapter15\\test.txt", true)){
            writer.append("Thank God its Friday");
        }catch(IOException | SecurityException exception){
            exception.getMessage();
        }
    }
}
