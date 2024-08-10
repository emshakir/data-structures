package com.ms.data.structures.linked_list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RotateLinkedListByKTest {

    ListNode listNode;

    RotateLinkedListByK rotateLinkedListByK;

    @BeforeEach
    void setUp() {
        rotateLinkedListByK = new RotateLinkedListByK();
        listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
    }

    @Test
    void rotateRight() {
        listNode.print(listNode);
        ListNode expected = rotateLinkedListByK.rotateRight(listNode, 7);
        listNode.print(expected);
    }

    @Test
    void rotateLeft() {
        listNode.print(listNode);
        ListNode expected = rotateLinkedListByK.rotateLeft(listNode, 2);
        listNode.print(expected);
    }
}