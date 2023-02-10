package chapterThree;

public class Parcel {
    public double amountOfParcel(double creditPercentage) {
        double bonusAmount = 1;
        if (creditPercentage >= 50 && creditPercentage <= 60){
            bonusAmount = creditPercentage * 200;}
        if (creditPercentage >= 61 && creditPercentage <=70){
            bonusAmount = creditPercentage * 250;}

        if (creditPercentage >= 71){
            bonusAmount = creditPercentage * 500;}
                    return bonusAmount;
    }

}