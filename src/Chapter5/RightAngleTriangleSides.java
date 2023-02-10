package Chapter5;

public class RightAngleTriangleSides {
    public static void main(String[] args) {


                for (int sideAb=1; sideAb<=500;sideAb++){
                    for (int sideBc =sideAb+1; sideBc<=500;sideBc++){
                        for (int hypo=sideBc+1;  hypo<=500; hypo++){
                        if ((sideAb*sideAb + sideBc*sideBc) == hypo*hypo){
                            System.out.printf(" %d^2 %s %d^2 %s %d^2%n ",  sideAb, "+", sideBc, "=" ,hypo);
                       }

                    }

                }

        }
    }
}
