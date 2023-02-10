package chapterThree;

public class Petrol {
    private String location;
    private String petrolType;
    private double quantityInLitres;
    private double pricePerLitre;
    private double percentageDiscount;
    private double netPurchaseAmount;

    public Petrol(String location, String petrolType, double quantityInLitres, double pricePerLitre) {
        this.location = location;
        this.petrolType = petrolType;
        this.quantityInLitres = quantityInLitres;
        this.pricePerLitre = pricePerLitre;
        // this.percentageDiscount = percentageDiscount;
        //this.netPurchaseAmount =
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

    public double getQuantityInLitres() {
        return quantityInLitres;
    }

    public void setPricePerLitre(double pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
    }

    public double getPricePerLitre() {
        return pricePerLitre;
    }

    public double PercentageDiscount() {
        percentageDiscount = (0.1 * (pricePerLitre * quantityInLitres));
        return percentageDiscount;
    }

    public double netPurchaseAmount() {
        //this.netPurchaseAmount = netPurchaseAmount;
        percentageDiscount = (0.1 * (pricePerLitre * quantityInLitres));
        System.out.println("""
                -----------------------------------
                This is a receipt of your purchase
                -----------------------------------
                """);

        netPurchaseAmount = ((quantityInLitres * pricePerLitre) - percentageDiscount);

        return netPurchaseAmount;
    }

    //public double getNetPurchaseAmount(){
      //  return netPurchaseAmount;
   // }

   // public double getPurchaseAmount() {
      //  return netPurchaseAmount;
   // }
    public String toLine() {
        String line = """
                ------------------------------------
                Plesea take your receipt. Thank you!
                ------------------------------------""";
        return line;
    }
}

