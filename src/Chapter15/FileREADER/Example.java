package Chapter15.FileREADER;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        char[] chars = new char[11];
        try(FileReader fileReader = new FileReader("C:\\Users\\ADMIN\\IdeaProjects\\javaProjects\\src\\Chapter15\\FileREADER\\Obodo")){
            var numberOfCharactersRead = fileReader.read(chars);
            System.out.println(numberOfCharactersRead);
            System.out.println(Arrays.toString(chars));
        }catch(IOException exception){
            System.err.println(exception);
        }
        }
}
