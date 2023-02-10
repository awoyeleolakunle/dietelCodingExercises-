package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HekkaParcels {
    @Test
    public void parcelDeliveryTest(){
       // Given that I have a parcel to deliver
        Parcel rider = new Parcel();
        // check my bonus when I make a delivery of 50 parcels
        double riderBonusAmount = rider.amountOfParcel(89);
       assertEquals(44500, riderBonusAmount);
    }
}
