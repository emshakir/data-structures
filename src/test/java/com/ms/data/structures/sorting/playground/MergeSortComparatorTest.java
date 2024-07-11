package com.ms.data.structures.sorting.playground;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class MergeSortComparatorTest {

    private MergeSortComparator mergeSort;


    @BeforeEach
    void setUp() {
        mergeSort = new MergeSortComparator();
    }

    @Test
    void mergeSort() {
        List<OnlineRetail> retailList = LoadCsv.getOnlineRetailList();
        mergeSort.mergeSort(retailList, 0, retailList.size() - 1, new OnlineRetailDescriptionComparator());
        retailList.forEach(System.out::println);
    }
}