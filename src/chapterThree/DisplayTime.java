package chapterThree;

public class DisplayTime {
    public static void main(String[] args) {
        Clock display = new Clock(05, 43, 24);
        System.out.printf("%s:%d:%d%n ", display.getHours(), display.getMinutes(), display.getSeconds());
    }
}
