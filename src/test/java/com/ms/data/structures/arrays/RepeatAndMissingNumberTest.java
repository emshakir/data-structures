package com.ms.data.structures.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatAndMissingNumberTest {

    @Test
    void get() {
        int[] input = {3, 1, 2, 5, 3};
        int[] actual = {4, 3};
        int[] expected = RepeatAndMissingNumber.get(input, input.length);
        assertArrayEquals(expected, actual);
    }
}