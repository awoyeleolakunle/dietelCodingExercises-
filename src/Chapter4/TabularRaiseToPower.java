package Chapter4;

public class TabularRaiseToPower {
    public static void main(String[] args) {
        System.out.printf("%4s%5s%5s%5s%n", "N1","N2","N3","N4");
        for (int i = 1; i <=5 ; i++) {
            int raiseToPowerOf=i;
            System.out.printf("%3d", i);
            for (int j = 1; j <4 ; j++) {
                raiseToPowerOf*=i;
                System.out.printf("%5d",raiseToPowerOf);
            }
            System.out.println();
        }
    }
}
