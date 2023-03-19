package LeetcodeAlgorithmBuilding;

public class reverseInteger {
    public static void main(String[] args) {
        reverseInteger("-455670");
    }

    private static void reverseInteger(String digits){
        int j = 0;
        int num = Integer.parseInt(String.valueOf(digits.charAt(digits.length()-1)));
        if (num == 0)
            j = digits.length()-2;
        else{j = digits.length()-1;}

            if(!String.valueOf(digits.charAt(0)).equals("-"))
                for ( int i = j; i >=0 ; i--) {
            System.out.print(digits.charAt(i));}
            else {
                System.out.print("-");
                for (int i = j; i >0; i--) {
                System.out.print(digits.charAt(i));
            }
        }
    }
}
