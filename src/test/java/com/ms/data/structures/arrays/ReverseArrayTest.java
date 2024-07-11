package com.ms.data.structures.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayTest {

    ReverseArray reverseArray;

    @BeforeEach
    void setUp() {
        reverseArray = new ReverseArray();
    }

    @Test
    void reverse() {

        int[] input = {10, 8, 7, 52, 87, 6};
        int[] output = {6, 87, 52, 7, 8, 10};
        reverseArray.reverse(input, 0, input.length - 1);
        assertArrayEquals(input, output, "Arrays are not equal");
    }
}