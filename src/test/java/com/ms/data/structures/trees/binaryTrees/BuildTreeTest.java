package com.ms.data.structures.trees.binaryTrees;

import org.junit.jupiter.api.Test;

class BuildTreeTest {

    @Test
    void buildTreeLevel() {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        TreeNode treeNode = BuildTree.buildTreeLevel(arr);
    }
}