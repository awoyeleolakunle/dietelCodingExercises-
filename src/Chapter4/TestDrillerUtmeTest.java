package Chapter4;

import org.junit.jupiter.api.Test;
import tdd.TestDriller;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrillerUtmeTest {
    @Test
    public void firstcopiestest() {
        TestDriller utme = new TestDriller();
        int priceOfFirstSet = utme.priceOf(4);
        assertEquals(8000, priceOfFirstSet);

    }

    @Test
    public void secondBatchTest() {
        TestDriller utme = new TestDriller();
        int priceOfSecondBatch = utme.priceOf(9);
        assertEquals(16200, priceOfSecondBatch);

    }

    @Test
    public void thirdBatchTest() {
        TestDriller utme = new TestDriller();
        int priceOfthirdBatch = utme.priceOf(10);
        assertEquals(16000, priceOfthirdBatch);
    }

    @Test
    public void fourthBatchTest() {
        TestDriller utme = new TestDriller();
        int priceOfFourthBatch = utme.priceOf(30);
        assertEquals(45000, priceOfFourthBatch);
    }

    @Test
    public void fifthBatchTest() {
        TestDriller utme = new TestDriller();
        int priceOfFifthBatch = utme.priceOf(50);
        assertEquals(65000, priceOfFifthBatch);
    }

    @Test
    public void sixthBatchTest() {
        TestDriller utme = new TestDriller();
        int priceOfSixthBatch = utme.priceOf(100);
        assertEquals(120000, priceOfSixthBatch);
    }

    @Test
    public void seventhBatchTest() {
        TestDriller utme = new TestDriller();
        int priceOfSeventhBatch = utme.priceOf(200);
        assertEquals(220000, priceOfSeventhBatch);
    }

    @Test
    public void eighthBatchTest() {
        TestDriller utme = new TestDriller();
        int priceOfEighthBatch = utme.priceOf(500);
        assertEquals(500000, priceOfEighthBatch);
    }
}


