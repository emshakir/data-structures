package com.ms.data.structures.linked_list.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsPalindromeTest {

    Node<Character> head;

    IsPalindrome isPalindrome;

    @BeforeEach
    void setUp() {
        isPalindrome = new IsPalindrome();
        head = new Node<Character>('M');
        head.next = new Node<>('A');
        head.next.next = new Node<>('D');
        head.next.next.next = new Node<>('D');
        head.next.next.next.next = new Node<>('A');
        head.next.next.next.next.next = new Node<>('M');
//        head.next.next.next = head.next.next;
    }

    @Test
    void isPalindrome() {
        boolean expected = isPalindrome.isPalindrome(head);
        assertTrue(expected, "Result didn't match.");
    }
}