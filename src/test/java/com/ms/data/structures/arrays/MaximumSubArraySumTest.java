package com.ms.data.structures.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubArraySumTest {

    MaximumSubArraySum maximumSubArraySum;

    @BeforeEach
    void setUp() {
        maximumSubArraySum = new MaximumSubArraySum();
    }

    @Test
    void divide() {
        int[] input = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, maximumSubArraySum.divide(input, 0, input.length - 1), "Output didn't match!");
    }
}