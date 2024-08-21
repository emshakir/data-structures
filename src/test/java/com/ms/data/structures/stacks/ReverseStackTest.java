package com.ms.data.structures.stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStackTest {

    ReverseStack revStack;

    Stack<Integer> stack;

    @BeforeEach
    void setUp() {
        revStack = new ReverseStack();
        stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.print();
    }

    @Test
    void reverse() {
        revStack.reverse(stack);
        stack.print();
    }
}