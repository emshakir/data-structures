package com.ms.data.structures.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubArraySumLengthTest {

    @Test
    void getLengthBrCase1() {

        int[] a = {2, 3, 5, 1, 9};
        int k = 10;
        int expected = 3;
        assertEquals(expected, LongestSubArraySumLength.getLengthBr(a, k), "Result didn't match");
    }

    @Test
    void getLengthBeCase1() {
        int[] a = {2, 3, 5, 1, 9};
        int k = 10;
        int expected = 3;
        assertEquals(expected, LongestSubArraySumLength.getLengthBe(a, k), "Result didn't match");
    }

    @Test
    void getLengthOCase1() {
        int[] a = {2, 3, 5, 1, 9};
        int k = 10;
        int expected = 3;
        assertEquals(expected, LongestSubArraySumLength.getLengthO(a, k), "Result didn't match");
    }

    @Test
    void getLengthBrCase2() {
        int[] a = {4, 6, 7, 3, 2, 1, 2, 1, 4, 9, 5, 4};
        int k = 9;
        int expected = 5;
        assertEquals(expected, LongestSubArraySumLength.getLengthBr(a, k), "Result didn't match");
    }

    @Test
    void getLengthBeCase2() {
        int[] a = {4, 6, 7, 3, 2, 1, 2, 1, 4, 9, 5, 4};
        int k = 9;
        int expected = 5;
        assertEquals(expected, LongestSubArraySumLength.getLengthBe(a, k), "Result didn't match");
    }

    @Test
    void getLengthOCase2() {
        int[] a = {4, 6, 7, 3, 2, 1, 2, 1, 4, 9, 5, 4};
        int k = 9;
        int expected = 5;
        assertEquals(expected, LongestSubArraySumLength.getLengthO(a, k), "Result didn't match");
    }
}