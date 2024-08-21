package com.ms.data.structures.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class ReverseQueueTest {


    ReverseQueue rq;
    Queue<Integer> queue;

    @BeforeEach
    void setUp() {
        rq = new ReverseQueue();
        queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
    }

    @Test
    void rev() {
        rq.rev(queue);
    }
}