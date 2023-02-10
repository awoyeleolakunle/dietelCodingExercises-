package HolidayAssignment;

public class SevenSegmentDisplay {
    private static final int [][]light= new int[5][4];
    public static void main(String[] args) {
        collectBinary("01100111");
        show();


    }
    private static void show(){
        for (int[] shine: light) {
            for (int lightup:shine) {
                if(lightup==1)
                    System.out.print(" # ");
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    private static void showSideA(){
        light[0][0] =1;
        light[0][1]=1;
        light[0][2]=1;
        light[0][3]=1;
    }
    private static void showSideB(){
        light[0][3]=1;
        light[1][3]=1;
        light[2][3]=1;
    }
    private static void showSideC(){
        light[2][3]=1;
        light[3][3]=1;
        light[4][3]=1;
    }
    private static void showSideD(){
        light[4][0]=1;
        light[4][1]=1;
        light[4][2]=1;
        light[4][3]=1;
    }
    private static void showSideE(){
        light[2][0]=1;
        light[3][0]=1;
        light[4][0]=1;
    }
    private static void showSideF(){
        light[0][0]=1;
        light[1][0]=1;
        light[2][0]=1;
    }
    private static void showSideG(){
        light[2][0]=1;
        light[2][1]=1;
        light[2][2]=1;
        light[2][3]=1;
    }
    private static void collectBinary(String number) {

        if (number.length()==8){
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '1' && number.charAt(7) == '1') {
                switch (i) {
                    case 0 -> showSideA();
                    case 1 -> showSideB();
                    case 2 -> showSideC();
                    case 3 -> showSideD();
                    case 4 -> showSideE();
                    case 5 -> showSideF();
                    case 6 -> showSideG();
                }
            }

        }
        }else{
            System.out.println("the length of the number must be 8");}
    }
}