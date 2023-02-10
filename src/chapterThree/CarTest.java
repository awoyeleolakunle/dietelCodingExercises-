package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarTest {
        @Test
    public void testThatCarCanBeCreated(){
            Car benz = new Car( "G-390", "2022", 50.00);
          //  assertNotNull(benz);
        }

        @Test
    public void testThatCarAttributesAreProperlyInitialised(){
            Car benz = new Car("G-990", "2022", 50.00);
            benz.getModel();
            benz.getYear();
            benz.getPrice();
            assertEquals("G-990", benz.getModel());
            assertEquals("2022", benz.getYear());
            assertEquals(50.00,benz.getPrice());
        }

        @Test
                public void testThatOnly(){
            Car benz = new Car("G-990", "2022", 50.00);
            benz.setPrice(-20000);
            assertEquals(50.00, benz.getPrice());
        }
    @Test
    public void testDiscount(){
            Car benz = new Car ("G-990", "2020", 3000000);
            benz.applyDiscount(10);

    }


    }

