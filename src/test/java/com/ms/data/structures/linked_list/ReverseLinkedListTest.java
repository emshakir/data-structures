package com.ms.data.structures.linked_list;

import com.ms.data.structures.linked_list.linkedlist.DoublyLinkedList;
import com.ms.data.structures.linked_list.linkedlist.DoublyNode;
import com.ms.data.structures.linked_list.linkedlist.LinkedList;
import com.ms.data.structures.linked_list.linkedlist.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {

    LinkedList<Integer> linkedList;

    DoublyLinkedList<Integer> doublyLinkedList;

    ReverseLinkedList<Integer> reverseLinkedList;

    @BeforeEach
    void setUp() {
        linkedList = new LinkedList<>();
        linkedList.addFirst(10);
        linkedList.addFirst(20);
        linkedList.addFirst(30);
        linkedList.addFirst(40);
        linkedList.addFirst(50);
        linkedList.addFirst(60);
        linkedList.addFirst(70);

        doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.addFirst(75);
        doublyLinkedList.addFirst(56);
        doublyLinkedList.addFirst(42);
        doublyLinkedList.addFirst(38);
        doublyLinkedList.addFirst(23);
        doublyLinkedList.addFirst(15);
        doublyLinkedList.addFirst(10);
        reverseLinkedList = new ReverseLinkedList<>();
    }

    @Test
    void reverse() {
        Node<Integer> head = linkedList.getHead();
        linkedList.print();
        Node<Integer> reversedHead = reverseLinkedList.reverse(head);
        linkedList.print(reversedHead);
    }

    @Test
    void reverseDoubly() {
        DoublyNode<Integer> head = doublyLinkedList.getHead();
        doublyLinkedList.print();
        DoublyNode<Integer> reversedHead = reverseLinkedList.reverseDoubly(head);
        doublyLinkedList.print(reversedHead);
    }

    @Test
    void remove() {
        DoublyNode<Integer> head = doublyLinkedList.getHead();
        doublyLinkedList.remove(2);
        doublyLinkedList.print();
        doublyLinkedList.printTail();
    }
}