package com.ms.data.structures.linked_list;

import com.ms.data.structures.linked_list.linkedlist.LinkedList;
import com.ms.data.structures.linked_list.linkedlist.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveNthNodeFromLastTest {

    LinkedList<Integer> linkedList;

    RemoveNthNodeFromLast removeNthNodeFromLast;

    @BeforeEach
    void setUp() {
        removeNthNodeFromLast = new RemoveNthNodeFromLast();
        linkedList = new LinkedList<>();
        linkedList.addFirst(5);
        linkedList.addFirst(4);
        linkedList.addFirst(3);
        linkedList.addFirst(2);
        linkedList.addFirst(1);
    }

    @Test
    void remove() {
        Node<Integer> head = linkedList.getHead();
        linkedList.print();
        Node<Integer> expected = removeNthNodeFromLast.remove(head, 1);
        linkedList.print(expected);

    }

    @Test
    void removeOp() {
        Node<Integer> head = linkedList.getHead();
        linkedList.print();
        Node<Integer> expected = removeNthNodeFromLast.removeOp(head, 5);
        linkedList.print(expected);

    }
}