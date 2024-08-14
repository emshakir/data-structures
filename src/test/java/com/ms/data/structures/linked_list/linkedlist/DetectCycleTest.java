package com.ms.data.structures.linked_list.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetectCycleTest {

    DetectCycle detectCycle;

    Node<Integer> head;

    @BeforeEach
    void setUp() {
        detectCycle = new DetectCycle();
        head = new Node<Integer>(1);
        head.next = new Node<>(2);
        head.next.next = new Node<>(3);
        head.next.next.next = new Node<>(4);
        head.next.next.next.next = new Node<>(5);
//        head.next.next.next = head.next.next;
    }

    @Test
    void isCycle() {
        boolean expected = detectCycle.isCycle(head);
        assertFalse(expected, "Result didn't match");
    }
}