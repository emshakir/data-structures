package com.ms.data.structures.stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SingleLoopNsePseTest {

    int[] input = {7, 9, 6, 8, 9, 5, 7, 4, 7};

    @BeforeEach
    void setUp() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Input: " + Arrays.toString(input));
    }

    @Test
    void singleLoopPSEqualENSE() {
        SingleLoopNsePse.singleLoopPSEqualENSE(input);
    }

    @Test
    void singleLoopPGEqualENGE() {
        SingleLoopNsePse.singleLoopPGEqualENGE(input);
    }
}