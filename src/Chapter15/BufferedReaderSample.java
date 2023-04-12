package Chapter15;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderSample {
    public static void main(String[] args) {
        try (InputStreamReader reader = new InputStreamReader(System.in);
             BufferedReader bufferedReader = new BufferedReader(reader);
             FileWriter writer = new FileWriter("C:\\Users\\ADMIN\\IdeaProjects\\javaProjects\\src\\Chapter15\\test2")) {
          String input =  bufferedReader.readLine();
          writer.write(input);

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

}
