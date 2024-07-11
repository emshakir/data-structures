package com.ms.data.structures.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    @Test
    void getContainerWithMostWaterCase1() {
        int[] input = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49;
        assertEquals(expected, ContainerWithMostWater.getContainerWithMostWater(input), "Result didn't match!");
    }

    @Test
    void getContainerWithMostWaterCase2() {
        int[] input = {1, 1};
        int expected = 1;
        assertEquals(expected, ContainerWithMostWater.getContainerWithMostWater(input), "Result didn't match!");
    }
    @Test
    void getContainerWithMostWaterOCase1() {
        int[] input = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49;
        assertEquals(expected, ContainerWithMostWater.getContainerWithMostWaterO(input), "Result didn't match!");
    }

    @Test
    void getContainerWithMostWaterOCase2() {
        int[] input = {1, 1};
        int expected = 1;
        assertEquals(expected, ContainerWithMostWater.getContainerWithMostWaterO(input), "Result didn't match!");
    }
}