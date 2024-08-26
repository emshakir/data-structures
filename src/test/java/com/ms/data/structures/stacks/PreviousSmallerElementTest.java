package com.ms.data.structures.stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PreviousSmallerElementTest {

    PreviousSmallerElement previousSmallerElement;

    @BeforeEach
    void setUp() {
        previousSmallerElement = new PreviousSmallerElement();
    }

    @Test
    void previousSmallerElement() {
        int[] input = {4, 5, 2, 10, 8};
        int[] expected = {-1, 4, -1, 2, 2};
        int[] actual = previousSmallerElement.previousSmallerElement(input);
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }

    @Test
    void previousSmallerReverseIteration() {
        int[] input = {4, 5, 2, 10, 8};
        int[] expected = {-1, 4, -1, 2, 2};
        int[] actual = previousSmallerElement.previousSmallerReverseIteration(input);
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }

    @Test
    void previousSmallerCircle() {
        int[] input = {4, 5, 2, 10, 8};
        int[] expected = {2, 4, -1, 2, 2};
        int[] actual = previousSmallerElement.previousSmallerCircle(input);
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }
}