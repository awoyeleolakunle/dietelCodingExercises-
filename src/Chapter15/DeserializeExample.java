package Chapter15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeExample {
    public static void main(String[] args) {
//        Dog dog = new Dog("Aja", 35);
        try(ObjectInputStream objectInputStream =
                    new ObjectInputStream(new FileInputStream("dog"))){
         var  dog = (Dog)objectInputStream.readObject();
            System.out.println(dog.toString());
        } catch(IOException | ClassNotFoundException | SecurityException exception){
            System.out.println(exception.getMessage());
        }
//        System.out.println(dog.getName());
//        System.out.println(dog.getAge());
    }
}
