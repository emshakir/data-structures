package com.ms.data.structures.linked_list;

import com.ms.data.structures.linked_list.linkedlist.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlattenLinkedListTest {

    ListNode listNode = null;

    FlattenLinkedList flattenLinkedList;

    @BeforeEach
    void setUp() {
        flattenLinkedList = new FlattenLinkedList();
        listNode = new ListNode(1);
        listNode.bottom = new ListNode(2);
        listNode.bottom.bottom = new ListNode(3);
        listNode.bottom.bottom.bottom = new ListNode(4);
        listNode.next = new ListNode(5);
        listNode.next.bottom = new ListNode(6);
        listNode.next.bottom.bottom = new ListNode(7);
        listNode.next.next = new ListNode(8);
        listNode.next.next.bottom = new ListNode(9);
        listNode.next.next.next = new ListNode(10);
    }

    @Test
    void flatten() {

        listNode.print(listNode);
        ListNode expected = flattenLinkedList.flatten(listNode);
        listNode.printBottom(expected);

    }
}