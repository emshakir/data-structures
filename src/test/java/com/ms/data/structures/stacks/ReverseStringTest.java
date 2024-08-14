package com.ms.data.structures.stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    ReverseString reverseString;

    @BeforeEach
    void setUp() {
        reverseString = new ReverseString();
    }

    @Test
    void reverseRec() {
        String sb = reverseString.reverse("madam", 0, new StringBuilder());
        System.out.println(sb);
    }
}