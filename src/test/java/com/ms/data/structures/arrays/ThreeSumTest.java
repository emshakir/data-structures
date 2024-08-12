package com.ms.data.structures.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    ThreeSum threeSum;

    @BeforeEach
    void setUp() {
        threeSum = new ThreeSum();
    }

    @Test
    void threeSumHashing() {
        int[] a = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = threeSum.threeSumHashing(a);
        System.out.println("Better: " + expected);
    }

    @Test
    void threeSumOptimal() {
        int[] a = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = threeSum.threeSumOptimal(a);
        System.out.println("Optimal: " + expected);
    }

    // [[-1,-1,2],[-1,0,1]]
}