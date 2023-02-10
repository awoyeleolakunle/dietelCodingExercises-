package Chapter7;

import org.junit.jupiter.api.Test;

import static Chapter7.MoreExampleOfArray.findOdd;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoreExanpleOfArrayTest {

    @Test

    public void testFindOdd() {
        int[] numbers = {11, 12, 13, 14, 19, 5};
        int[] oddElements = MoreExampleOfArray.findOdd(numbers);
        int[] expected = {11, 13, 19, 5};
        assertArrayEquals(expected, oddElements);
    }
}
