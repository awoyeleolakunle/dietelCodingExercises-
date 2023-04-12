package Chapter6;

public class SumdigitFavour {

    public static void main(String[] args) {
        System.out.println(sumOfDigit(55474675));
    }
    public static int sumOfDigit(int number){
        int sum = 0;
        while(number>0){
            sum+=number%10;
            number/=10;
        }
        return sum;

    }
}
