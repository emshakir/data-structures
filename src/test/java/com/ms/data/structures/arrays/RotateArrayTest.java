package com.ms.data.structures.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    RotateArray rotateArray;

    @BeforeEach
    void setUp() {
        rotateArray = new RotateArray();
    }

    @Test
    void rotate() {
        int[] input = {1, 2, 3};
        rotateArray.rotateLeftBrute(input, 2);
        System.out.println(Arrays.toString(input));
    }
}