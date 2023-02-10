package Chapter5;

public class ClassworkDrawing {
    public static void main(String[] args) {
       // String diamond = "";
        //for (int counter = 1; counter <= 9; counter ++ ) {
          //  diamond+= "*";
            //System.out.println(diamond);
            //for (int i = 9; i >=1;  i-= 2) {
              //  diamond+-="*";
                //System.out.println();
            //}
                int blank =4;
        for(int i=1; i<10; i+=2){
            for (int j = 0; j<blank ; j++){
                System.out.print(" ");
            }
            for(int j =1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
            blank--;
        }
        blank=1;
        for (int i =7; i>0; i-=2){
            for(int j = 0; j< blank; j++){
                System.out.print(" ");

            }
            for (int j =i; j>0;j--){
                System.out.print("*");
            }
            System.out.println();
            blank++;

        }
    }
}