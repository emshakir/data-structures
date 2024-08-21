package com.ms.data.structures.queue;

import java.util.Queue;

public class ReverseQueue {

    public Queue<Integer> rev(Queue<Integer> q) {
        //add code here.
        return recHelper(q, q.poll());

    }

    private Queue<Integer> recHelper(Queue<Integer> q, int data) {

        if (q.isEmpty()) {
            q.offer(data);
            return q;
        }
        recHelper(q, q.poll());
        q.offer(data);
        return q;
    }
}
