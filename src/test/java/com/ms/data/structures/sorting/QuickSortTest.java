package com.ms.data.structures.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    private QuickSort quickSort;

    @BeforeEach
    void setUp() {
        quickSort = new QuickSort();
    }

    @Test
    void quickSort() {
        int[] input = {8, 5, 7, 6, 41, 29, 6, 3};
        int[] output = {3, 5, 6, 6, 7, 8, 29, 41};
        quickSort.quickSort(input, 0, input.length - 1);
        assertArrayEquals(input, output, "Arrays are not equal, not sorted");
    }

    @Test
    void quickSortAsSI() {
        int[] input = {3, 2, 1, 5, 6, 4};
        int[] output = {1, 2, 3, 4, 5, 6};
        int[] outputDes = {6, 5, 4, 3, 2, 1};
        quickSort.quickSort(input, 0, input.length - 1);
        assertArrayEquals(input, outputDes, "Arrays are not equal, not sorted");
    }
}