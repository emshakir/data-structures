package com.ms.data.structures.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthSpecificElementTest {

    @Test
    void getKthLargestCase1() {
        int[] input = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int expected = 5;
        assertEquals(expected, KthSpecificElement.getKthLargest(input, k), "Result didn't match!");
    }

    @Test
    void getKthLargestCase2() {
        int[] input = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        int expected = 4;
        assertEquals(expected, KthSpecificElement.getKthLargest(input, k), "Result didn't match!");
    }

    @Test
    void getKthSmallestCase1() {
        int[] input = {3, 2, 1, 5, 4};
        int k = 2;
        int expected = 2;
        assertEquals(expected, KthSpecificElement.getKthSmallest(input, k), "Result didn't match!");
    }

    @Test
    void getKthSmallestCase2() {
        int[] input = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        int expected = 3;
        assertEquals(expected, KthSpecificElement.getKthSmallest(input, k), "Result didn't match!");
    }
}