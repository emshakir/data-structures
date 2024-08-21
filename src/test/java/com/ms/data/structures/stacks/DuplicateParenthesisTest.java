package com.ms.data.structures.stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateParenthesisTest {

    @Test
    void isDuplicate() {
        assertTrue(DuplicateParenthesis.isDuplicate("((a+b))"));
        assertFalse(DuplicateParenthesis.isDuplicate("(a+b)"));
    }
}