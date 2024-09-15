package com.ms.data.playground.arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SortAndReduceTest {


    @Test
    void processListUntilEmpty() {

        List<Integer> list = List.of(10, 15, 41, 85, 45, 78, 53, 14, 55, 66, 3, 22);
        List<Integer> input = new ArrayList<>(list);
        SortAndReduce.processListUntilEmpty(input);
    }
}