package com.ms.data.structures.stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NextSmallerElementTest {

    NextSmallerElement nextSmallerElement;

    @BeforeEach
    void setUp() {
        nextSmallerElement = new NextSmallerElement();
    }

    @Test
    void nextSmallerForwardIteration() {
        int[] input = {4, 5, 2, 10, 8};
        int[] expected = {-1, 4, -1, 2, 2};
        int[] actual = nextSmallerElement.nextSmallerForwardIteration(input);
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }

    @Test
    void nextSmallerReverseIteration() {
        int[] input = {4, 5, 2, 10, 8};
        int[] expected = {-1, 4, -1, 2, 2};
        int[] actual = nextSmallerElement.nextSmallerReverseIteration(input);
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }

    @Test
    void nextSmallerCircle() {
        int[] input = {4, 5, 2, 10, 8};
        int[] expected = {2, 4, -1, 2, 2};
        int[] actual = nextSmallerElement.nextSmallerCircle(input);
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }
}