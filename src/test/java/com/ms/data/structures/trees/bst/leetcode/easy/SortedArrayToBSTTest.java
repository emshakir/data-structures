package com.ms.data.structures.trees.bst.leetcode.easy;

import com.ms.data.structures.trees.binarytree.BuildTree;
import com.ms.data.structures.trees.binarytree.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedArrayToBSTTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void sortedArrayToBST() {

        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        TreeNode root = SortedArrayToBST.sortedArrayToBST(input);
        BuildTree.printLevelLn(root);
    }
}