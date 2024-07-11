package com.ms.data.structures.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxAndMinElementsTest {

    MaxAndMinElements maxAndMinElements;

    @BeforeEach
    void setUp() {
        maxAndMinElements = new MaxAndMinElements();
    }

    @Test
    void getMaxMin() {
        int[] input = {8, 5, 9, 15, 78, 96, 25, 45, 85, 99};
        assertArrayEquals(maxAndMinElements.getMaxMin(input), new int[]{5, 99});
    }
}