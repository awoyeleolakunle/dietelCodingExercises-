package Chapter5;

public class TriangleDrawing {
    public static void main(String[] args) {
        int space = 0;
        int count = 1;

        a:
            for (int i = 1; i <= 10; i++) {
                for (int j = 0; j <= space; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
                space = 0;

            }
            System.out.println(" ");
            // space = 0;
            b:
            for (int i = 10; i >= 1; i--) {
                //for (int j = 0; j <= space; j++) {
                //    System.out.print(" ");

                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
                //space++;
            }
            space = 10;
            c:
            for (int i = 1; i <= 10; i++) {
                for (int j = 0; j <= space; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
                space--;

            }
            space = 0;
            System.out.println();
            d:
            for (int i = 1; i <= 10; i++) {
                for (int j = 0; j <= space; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
                space++;
            }
            space = 0;
            b:
            for (int i = 10; i >= 1; i--) {
                for (int j = 0; j <= space; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
                space++;
            }

        }
    }
