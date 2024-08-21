package com.ms.data.structures.queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class StackUsing2Queue {

    Queue<Integer> Q1 = new LinkedList<>();
    Queue<Integer> Q2 = new LinkedList<>();


    // Method 1 - add -> O(N), pop() and peek() -> O(1)
    public void add(int data) {
        Q2.offer(data);
        while (!Q1.isEmpty()) {
            Q2.offer(Q1.remove());
        }
        Queue<Integer> temp = Q2;
        Q2 = Q1;
        Q1 = temp;
    }

    public int remove() {
        if (Q1.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return Q1.poll();
    }

    public int peek() {
        if (Q1.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return Q1.peek();
    }
}
