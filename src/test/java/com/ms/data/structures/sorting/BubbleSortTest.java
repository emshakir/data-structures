package com.ms.data.structures.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    BubbleSort selection;

    @BeforeEach
    void setUp() {
        selection = new BubbleSort();
    }

    @Test
    void sortAscending() {
        int[] inputArr = {5, 4, 1, 6, 2};
        int[] outputArr = {1, 2, 4, 5, 6};
        assertArrayEquals(selection.sortAscending(inputArr), outputArr);
    }

    @Test
    void sortDescending() {
        int[] inputArr = {5, 4, 1, 6, 2};
        int[] outputArr = {6, 5, 4, 2, 1};
        assertArrayEquals(selection.sortDescending(inputArr), outputArr);
    }
}