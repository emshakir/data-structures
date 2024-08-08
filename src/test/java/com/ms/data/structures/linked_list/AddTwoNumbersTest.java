package com.ms.data.structures.linked_list;

import com.ms.data.structures.linked_list.linkedlist.LinkedList;
import com.ms.data.structures.linked_list.linkedlist.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {

    LinkedList<Integer> l1;
    LinkedList<Integer> l2;

    AddTwoNumbers addTwoNumbers;

    @BeforeEach
    void setUp() {
        addTwoNumbers = new AddTwoNumbers();
        l1 = new LinkedList<>();
        l1.addFirst(3);
        l1.addFirst(4);
        l1.addFirst(2);

        l2 = new LinkedList<>();
        l2.addFirst(4);
        l2.addFirst(6);
        l2.addFirst(5);
    }

    @Test
    void add() {
        l1.print();
        l2.print();
        Node<Integer> headL1 = l1.getHead();
        Node<Integer> headL2 = l2.getHead();

        Node<Integer> expected = addTwoNumbers.add(headL1, headL2);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        l1.print(expected);
    }
}