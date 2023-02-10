package chapterThree;

public class Petrol {
    private String location;
    private String petrolType;
    private int quantityInLitres;
    private double pricePerLitre;
    private double percentageDiscount;
    private double netPurchaseAmount;

    public Petrol(String location, String petrolType, int quantityInLitres, double pricePerLitre, double percentageDiscount) {
    this.location = location;
    this.petrolType = petrolType;
    this.quantityInLitres = quantityInLitres;
    this.pricePerLitre = pricePerLitre;
    this.percentageDiscount = percentageDiscount;
    double netPurchaseAmount = 0;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public String getpetrolType() {
        return petrolType;
    }

    public void setQuantityInLitres(int quantityInLitres) {
        this.quantityInLitres = quantityInLitres;
    }

    public int getQuantityInLitres() {
        return quantityInLitres;
    }

    public void setPricePerLitre(double pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
    }

    public double getPricePerLitre() {
        return pricePerLitre;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
       this.percentageDiscount = (10/100) * pricePerLitre;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }
    public void setPurchaseAmount(double netPurchaseAmount) {
        this.netPurchaseAmount = netPurchaseAmount;
        this.netPurchaseAmount = (quantityInLitres* pricePerLitre) - percentageDiscount;
    }

    public double getPurchaseAmount() {
        return netPurchaseAmount;
    }
}

