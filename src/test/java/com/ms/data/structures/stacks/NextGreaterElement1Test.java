package com.ms.data.structures.stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NextGreaterElement1Test {

    NextGreaterElement1 NGE;

    @BeforeEach
    void setUp() {
        NGE = new NextGreaterElement1();
    }

    @Test
    void nextGreaterElementBetter() {
        int[] input = {1, 3, 2, 5, 4, 7, 8};
        int[] actual = NGE.nextGreaterElementBetter(input);
        System.out.println(Arrays.toString(actual));
    }

    @Test
    void nextGreaterElementBetterOther() {
        int[] input = {1, 3, 2, 5, 4, 7, 8};
        int[] actual = NGE.nextGreaterElementBetterOther(input);
        System.out.println(Arrays.toString(actual));
    }
}