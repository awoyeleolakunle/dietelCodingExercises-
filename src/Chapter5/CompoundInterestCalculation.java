package Chapter5;

public class CompoundInterestCalculation {
    public static void main(String[] args) {
        //  double r = 0.05;
        //  int i = 1;
        // double amount= 1000;
        //  for (; i <= 10; i++ ){
        //  amount = ((amount*0.05)+amount);
        //      System.out.printf("%s%n for year %s%n ", amount, i );
        //  }

        //  }
//}
        double r = 0.05;
        int i = 1;
        double amount = 1000;
        int years = 0;
        while (years < 10) {
            amount = ((amount * 0.05) + amount);
            years+=1;
            System.out.printf(" %s%n for year %s%n ", amount, years);
        }
    }
}
