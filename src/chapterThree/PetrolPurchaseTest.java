package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PetrolPurchaseTest {
    @Test
    public void PetrolPurchaseTest() {
        Petrol eporobi = new Petrol("yaba", "oil", 5, 250.00, 25.00 );
        assertNotNull(eporobi);
    }

    @Test
    public void testInitialAttributes() {
        Petrol eporobi = new Petrol("yaba", "oil", 5, 250.00, 25.00);
        eporobi.getLocation();
        eporobi.getpetrolType();
        eporobi.getQuantityInLitres();
        eporobi.getPricePerLitre();
        eporobi.getPercentageDiscount();
        assertEquals("yaba", eporobi.getLocation());
        assertEquals("oil", eporobi.getpetrolType());
        assertEquals(5, eporobi.getQuantityInLitres());
        assertEquals(250.00, eporobi.getPricePerLitre());
        assertEquals(25.00, eporobi.getPercentageDiscount());

    }
        @Test
          public void testPurchaseAmount(){
            Petrol eporobi = new Petrol("yaba", "oil", 5, 250.00, 25.00  );
            eporobi.setPurchaseAmount(20.00);
            eporobi.getPurchaseAmount();
            assertEquals( 1225.0,eporobi.getPurchaseAmount());
        }




    }
