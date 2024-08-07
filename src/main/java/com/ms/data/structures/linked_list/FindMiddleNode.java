package com.ms.data.structures.linked_list;

public class FindMiddleNode {

    public Node<Integer> getMiddleNode(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
