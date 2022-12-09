package Chapter7;

public class PrimeNumbersMethod {
    public static void main(String[] args) {

        showPrimeNumber(10000);
        //primeNumber(7);

    }

    private static int findPrimeNumber(int number) {
        int count = 1;
        int factor = 0;
        while (count <= number) {

            if (number % count == 0)
                factor++;
            count++;
        }
        if (factor == 2){
            System.out.println(number + " is a prime number");
            return number;
        }
        return 0;
    }

    private static void showPrimeNumber(int number) {
        int numberOfPrimeNumbers = 0;
        for (int counter = 1; counter <= number; counter++) {
            int primeNumber = findPrimeNumber(counter);
            if (primeNumber > 0) {
                numberOfPrimeNumbers++;
            }

        }
        System.out.println("there are " + numberOfPrimeNumbers + " prime numbers in " + number );
    }

}


