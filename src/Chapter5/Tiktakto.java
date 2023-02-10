package Chapter5;

public class Tiktakto {
    public static void main(String[] args) {
        int blank=3;
        for(int i =1; i<=3; i++){
            for(int j=1; j<blank;j++) {
                System.out.print("O");
            }
            System.out.println();

                for(int j=1; j<=i;j++){
                    System.out.print("X");
                }
            blank--;
            }
        }

    }
