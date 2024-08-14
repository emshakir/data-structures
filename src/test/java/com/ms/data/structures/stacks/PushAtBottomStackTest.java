package com.ms.data.structures.stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PushAtBottomStackTest {

    PushAtBottomStack pushAtBottomStack;
    Stack<Integer> stack;

    @BeforeEach
    void setUp() {
        pushAtBottomStack = new PushAtBottomStack();
        stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);
    }

    @Test
    void pushAtBottomBrute() {
        pushAtBottomStack.pushAtBottomBrute(4, stack);
        stack.print();
    }

    @Test
    void pushAtBottomBetter() {
        pushAtBottomStack.pushAtBottomBetter(4, stack);
        stack.print();
    }
}