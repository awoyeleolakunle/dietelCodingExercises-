package Chapter15;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileClassExample {

    public static void main(String[] args) {

        Path path = Paths.get("a:/b/c/");

        Path path2 = Paths.get("a","b","c");

        System.out.println(path.getFileName());
        System.out.println(path.normalize());
        System.out.println(System.getProperty("file.separator"));
        System.out.println(path.getRoot());
        System.out.println(path);
        System.out.println(path2);


    }
}
