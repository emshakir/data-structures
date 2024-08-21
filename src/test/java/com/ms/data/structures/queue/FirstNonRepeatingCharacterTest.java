package com.ms.data.structures.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstNonRepeatingCharacterTest {

    FirstNonRepeatingCharacter firstNonRepeatingCharacter;

    @BeforeEach
    void setUp() {
        firstNonRepeatingCharacter = new FirstNonRepeatingCharacter();
    }

    @Test
    void firstNonRepeatingCharacter() {
        String input = "aabccxb";
        String actual = "a-1bbbbx";
        String expected = firstNonRepeatingCharacter.firstNonRepeatingCharacter(input);
        assertEquals(expected, actual);
    }
}