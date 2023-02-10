package Chapter5;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class CompoundInterestCalculation {
    public static void main(String[] args) {
        //BigDecimal rate = BigDecimal.valueOf( 0.05);

        //BigDecimal amount= BigDecimal.valueOf( 1000);
        //for (int year = 1; year <=10 ; year++) {
        //amount = (amount.multiply(rate) ).add(amount);
        //  System.out.printf("%s for year %s%n ", amount, year);
        //}

        //  }
//}
        double rate =  0.05;
         double amount = 1000;
        int years = 0;
        while (years < 10) {
            amount = (amount*rate)+ amount;
            ++years;
            System.out.printf(" %s for year %s%n ", NumberFormat.getCurrencyInstance().format(amount), years);
        }
    }
}

