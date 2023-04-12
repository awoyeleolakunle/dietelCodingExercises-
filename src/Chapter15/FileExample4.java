package Chapter15;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;

public class FileExample4 {
    public static void main(String[] args) {
        Path path = Path.of("C:\\Users\\ADMIN\\Desktop\\Regnos2");

        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)){
            Iterator<Path> iterator = directoryStream.iterator();
            while(iterator.hasNext()){
                Path path1 = iterator.next();
                System.out.println(path1.getFileName());
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }


        }
}
