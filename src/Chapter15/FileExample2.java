package Chapter15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileExample2 {
    public static void main(String[] args) {
//        Path path = Path.of("a", "b","c");
//        System.out.println("Path:: " + path);
//        System.out.println("Path ends with .java:: "+path.endsWith(Path.of("c.java")));

        Path path = Path.of("C:\\Users\\ADMIN\\Desktop\\RegnosFileExample\\test.java");
        try {
            Path filePath = Files.createFile(path);
            Files.newDirectoryStream(path);
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
