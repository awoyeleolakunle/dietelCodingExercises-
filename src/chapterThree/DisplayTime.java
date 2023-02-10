package chapterThree;

public class DisplayTime {
    public static void main(String[] args) {
        Clock display = new Clock(05, 59, 60);
        System.out.printf("%02d:%02d:%02d%n ", display.getHours(), display.getMinutes(), display.getSeconds());
    }
}
