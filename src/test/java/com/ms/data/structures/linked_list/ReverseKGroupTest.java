package com.ms.data.structures.linked_list;

import com.ms.data.structures.linked_list.linkedlist.LinkedList;
import com.ms.data.structures.linked_list.linkedlist.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseKGroupTest {

    ReverseKGroup reverseKGroup;

    Node<Integer> head;

    @BeforeEach
    void setUp() {
        reverseKGroup = new ReverseKGroup();
        head = new Node<>(5);
        head.next = new Node<>(4);
        head.next.next = new Node<>(3);
        head.next.next.next = new Node<>(7);
        head.next.next.next.next = new Node<>(9);
        head.next.next.next.next.next = new Node<>(2);
    }

    @Test
    void reverseKGroup() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.print(head);
        Node<Integer> expected = reverseKGroup.reverseKGroup(head, 3);
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        ll.print(expected);
    }

    @Test
    void reverseKGroupRec() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.print(head);
        Node<Integer> expected = reverseKGroup.reverseKGroupRec(head, 3);
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        ll.print(expected);
    }
}