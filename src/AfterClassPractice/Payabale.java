package AfterClassPractice;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Payabale {

    public static void main(String[] args) {
        //create four-element Payable array
        payableInterface[] payableObjects = new payableInterface[]{
                new Invoice("01234", "seat", 2, 375.00),
                new Invoice("56789", "tire", 4, 79.95),
                new SalariedEmployee("John", "Smith", "111-11-1111", 800.00),
                new SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00)
        };

        payableInterface[] payableInterfaces = {new Invoice("01234", "seat", 2, 375.00),
                new Invoice("56789", "tire", 4, 79.95),
                new SalariedEmployee("John", "Smith", "111-11-1111", 800.00),
                new SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00)};


        int[][] array =new int[][]{{1,2,3},{12,13}};
        System.out.println(Arrays.deepToString(array));
    }
}
