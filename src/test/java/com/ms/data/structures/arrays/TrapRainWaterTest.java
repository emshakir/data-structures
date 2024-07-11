package com.ms.data.structures.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrapRainWaterTest {


    @Test
    void getTrappedRainWater() {
        int[] a = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int output = 6;
        assertEquals(output, TrapRainWater.getTrappedRainWater(a));
    }

    @Test
    void getTrappedRainWaterO() {
        int[] a = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int output = 6;
        assertEquals(output, TrapRainWater.getTrappedRainWaterO(a));
    }
}