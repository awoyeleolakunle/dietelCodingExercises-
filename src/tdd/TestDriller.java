package tdd;

public class TestDriller {

    public int priceOf(int numberOfCopies) {
        int amountToPay = 1;
        if (numberOfCopies <= 4) {
            amountToPay = numberOfCopies * 2000;
        }

        if ((numberOfCopies >= 5) && (numberOfCopies <= 9)) {
            amountToPay = numberOfCopies * 1800;
        }

        if ((numberOfCopies >= 10) && (numberOfCopies <= 29)) {
            amountToPay = numberOfCopies * 1600;
        }

        if ((numberOfCopies >= 30) && (numberOfCopies <= 49)) {
            amountToPay = numberOfCopies * 1500;
        }

        if ((numberOfCopies >= 50) && (numberOfCopies <= 99)) {
            amountToPay = numberOfCopies * 1300;
        }

        if ((numberOfCopies >= 100) && (numberOfCopies <= 199)) {
            amountToPay = numberOfCopies * 1200;
        }

        if ((numberOfCopies >= 200) && (numberOfCopies <= 499)) {
        amountToPay = numberOfCopies * 1100;
    }

        if (numberOfCopies >=500) {
        amountToPay = numberOfCopies * 1000;
    }
        return amountToPay;
}
}
