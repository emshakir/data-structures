package com.ms.data.structures.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum() {
        int[] nums = {2, 6, 5, 8, 11};
        int[] actual = {1, 3};
        int[] expected = TwoSum.twoSum(nums, 14);
        assertArrayEquals(expected, actual, "Result didn't match!");
    }

    @Test
    void twoSumSorted() {
        int[] nums = {2, 5, 6, 8, 11};
        int[] actual = {2, 3};
        int[] expected = TwoSum.twoSumSorted(nums, 14);
        assertArrayEquals(expected, actual, "Result didn't match!");
    }
}