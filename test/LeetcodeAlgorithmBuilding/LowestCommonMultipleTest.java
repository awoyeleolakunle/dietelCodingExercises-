package LeetcodeAlgorithmBuilding;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LowestCommonMultipleTest {
    private LowestCommonMultiple lowestCommonMultiple;

    @Test
    public void getLowestCommonMultipleTest() {
        //Given that I have a number
        int number = 1023;
        //when I have an array that contains the lcm of my number
        int [] arrayOfLcm = LowestCommonMultiple.getLowestCommonMultipleOf(number);
        //check that my array contains [3, 11, 31].
        int [] expected = {3,11,31};
        assertEquals(Arrays.toString(expected), Arrays.toString(arrayOfLcm));
    }
}