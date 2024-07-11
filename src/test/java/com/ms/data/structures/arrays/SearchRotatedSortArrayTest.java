package com.ms.data.structures.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchRotatedSortArrayTest {

    SearchRotatedSortArray searchRotatedSortArray;

    @BeforeEach
    void setUp() {
        searchRotatedSortArray = new SearchRotatedSortArray();
    }

    @Test
    void search() {
        int[] input = {7, 0, 1, 2, 4, 5, 6};
        int result = searchRotatedSortArray.search(input, 5);
        assertEquals(5, result);
    }
}