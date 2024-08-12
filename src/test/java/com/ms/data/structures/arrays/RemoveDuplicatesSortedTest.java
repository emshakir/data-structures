package com.ms.data.structures.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesSortedTest {

    RemoveDuplicatesSorted removeDuplicatesSorted;

    @BeforeEach
    void setUp() {
        removeDuplicatesSorted = new RemoveDuplicatesSorted();
    }

    @Test
    void removeDuplicates() {

        int[] input = {0, 0, 1, 1, 2, 3, 4, 4, 5, 6};
        int size = removeDuplicatesSorted.removeDuplicates(input);
        assertEquals(7, size);
    }
}