package com.ms.data.structures.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    private MergeSort mergeSort;

    @BeforeEach
    void setUp() {
        mergeSort = new MergeSort();
    }

    @Test
    void divide() {
        int[] input = {9, 5, 8};
        int[] output = {5, 8, 9};
        mergeSort.divide(input, 0, 2);
        assertArrayEquals(input, output, "Arrays are not equal");
    }
    @Test
    void divideOther() {
        int[] input = {9, 5, 8, 4, 3, 7};
        int[] output = {3, 4, 5, 7, 8, 9};
        mergeSort.divide(input, 0, 5);
        assertArrayEquals(input, output, "Arrays are not equal");
    }
}