package com.ms.data.structures.linked_list;

public class DoublyNode<T> {

    T data;
    DoublyNode<T> next;
    DoublyNode<T> prev;

    public DoublyNode(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
