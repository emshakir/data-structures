package com.ms.data.structures.trees.binaryTrees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildTreeTest {

    @Test
    void buildTreeLevel() {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        Node node = BuildTree.buildTreeLevel(arr);
    }
}