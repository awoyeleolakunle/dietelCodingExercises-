package LeetcodeAlgorithmBuilding;

public class BinaryToDecimalConversion {
    public static void main(String[] args) {
        int result = binaryToDecimalConversion("101010");
        System.out.println(result);
    }

    private static int binaryToDecimalConversion( String binary ){
        int sum=0;
        int length = binary.length()-1;

        for (int i = 0; i <binary.length() ; i++) {
            int newNum =0;
            int num =1;
            for (int j = length; j > 0; j--) {
                num *=2;
            }
            newNum = num * Character.getNumericValue(binary.charAt(i));
            sum+=newNum;

            length--;
        } return sum;
    }
}
