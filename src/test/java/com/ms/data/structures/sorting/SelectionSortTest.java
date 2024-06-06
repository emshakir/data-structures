package com.ms.data.structures.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SelectionSortTest {

    private SelectionSort selectionSort;

    @BeforeEach
    void setUp() {
        selectionSort = new SelectionSort();
    }

    @Test
    void sortAscending() {
        int[] input = {6, 2, 3, 4, 5, 1};
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(selectionSort.sortAscending(input), expected, "Two arrays are not equal");
    }

    @Test
    void sortDescending() {
        int[] input = {6, 2, 3, 4, 5, 1};
        int[] expected = {6, 5, 4, 3, 2, 1};
        assertArrayEquals(selectionSort.sortDescending(input), expected, "Two arrays not are equal");
    }
}