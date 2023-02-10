package chapterThree;

public class CarApplication {
    public static void main(String[] args) {
        Car bmw = new Car("A5", "2021", 3000000);
        Car toyota = new Car("camry", "2021", 5000000);
        System.out.println(bmw.getPrice());
        System.out.println(toyota.getPrice());

    }


}
