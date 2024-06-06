package com.ms.data.structures.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    private InsertionSort insertionSort;

    @BeforeEach
    void setUp() {
        insertionSort = new InsertionSort();
    }

    @Test
    void sortAscending() {
        int[] input = {6, 2, 3, 4, 5, 1};
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(insertionSort.sortAscending(input), expected, "Two arrays are not equal");
    }

    @Test
    void sortDescending() {
        int[] input = {6, 2, 3, 4, 5, 1};
        int[] expected = {6, 5, 4, 3, 2, 1};
        assertArrayEquals(insertionSort.sortDescending(input), expected, "Two arrays not are equal");
    }
}