package org.example;

import org.example.OddNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the OddNumbers utility class.
 */
class OddNumbersTest {

    @Test
    void getOddNumbersUpTo_shouldReturnAllOddNumbersUpToEvenLimit() {
        int[] result = OddNumbers.getOddNumbersUpTo(10);
        assertArrayEquals(new int[]{1, 3, 5, 7, 9}, result,
                "Should return odds from 1 to 9 when limit is 10");
    }

    @Test
    void getOddNumbersUpTo_shouldIncludeUpperBoundWhenItIsOdd() {
        assertArrayEquals(new int[]{1, 3, 5, 7, 9, 11},
                OddNumbers.getOddNumbersUpTo(11),
                "Should include 11 when n=11");
    }

    @Test
    void getOddNumbersUpTo_shouldReturnOnlyOne_whenLimitIs1() {
        assertArrayEquals(new int[]{1}, OddNumbers.getOddNumbersUpTo(1));
    }

    @Test
    void getOddNumbersUpTo_shouldReturnEmptyArray_whenLimitIsZero() {
        assertArrayEquals(new int[0], OddNumbers.getOddNumbersUpTo(0));
    }

    @Test
    void getOddNumbersUpTo_shouldReturnEmptyArray_forNegativeInput() {
        assertArrayEquals(new int[0], OddNumbers.getOddNumbersUpTo(-5));
        assertArrayEquals(new int[0], OddNumbers.getOddNumbersUpTo(-1));
    }

    @Test
    void getOddNumbersUpTo_shouldHandleLargerInputsCorrectly() {
        int[] result = OddNumbers.getOddNumbersUpTo(21);
        assertEquals(11, result.length, "There should be 11 odd numbers <= 21");
        assertEquals(21, result[result.length - 1], "Last number should be 21");
    }
}