package com.ms.data.structures.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestRectangleInHistogramTest {

    @Test
    void getMaxArea() {
        int[] input = {2, 1, 5, 6, 2, 3, 1};
        LargestRectangleInHistogram.getMaxArea(input);
    }
}