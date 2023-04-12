package Chapter15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class FileExample3 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(args));
        for (int i = 0; i < args.length; i++) {
            try {
                Path path = Path.of("C:\\Users\\ADMIN\\Desktop\\Regnos2\\" + args[i] + ".java");

                Files.createFile(path);
            }catch(IOException exception){
                System.out.println(exception.getMessage());
            }
        }
    }
}
