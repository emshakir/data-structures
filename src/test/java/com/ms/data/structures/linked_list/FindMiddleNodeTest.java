package com.ms.data.structures.linked_list;

import com.ms.data.structures.linked_list.linkedlist.LinkedList;
import com.ms.data.structures.linked_list.linkedlist.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMiddleNodeTest {

    LinkedList<Integer> linkedList;

    FindMiddleNode findMiddleNode;

    @BeforeEach
    void setUp() {
        findMiddleNode = new FindMiddleNode();
        linkedList = new LinkedList<>();
        linkedList.addFirst(5);
        linkedList.addFirst(4);
        linkedList.addFirst(3);
        linkedList.addFirst(2);
        linkedList.addFirst(1);
    }

    @Test
    void getMiddleNode() {
        Node<Integer> head = linkedList.getHead();
        linkedList.print();
        Node<Integer> expected = findMiddleNode.getMiddleNode(head);
        assertEquals(3, expected.data, "Result didn't match.");
    }
}