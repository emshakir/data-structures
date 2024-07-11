package com.ms.data.structures.sorting.playground;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortComparableTest {

    private MergeSortComparable mergeSort;


    @BeforeEach
    void setUp() {
        mergeSort = new MergeSortComparable();
    }

    @Test
    void mergeSort() {
        List<OnlineRetail> retailList = LoadCsv.getOnlineRetailList();
        mergeSort.mergeSort(retailList, 0, retailList.size() - 1);
        retailList.forEach(System.out::println);
    }
}