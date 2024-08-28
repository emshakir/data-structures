package com.ms.data.structures.trees.binaryTrees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RecursiveTreeTraversalTest {

    TreeNode root;

    @BeforeEach
    void setUp() {
        int[] input = {1, 2, 4, 3, 4, 5, -1, -1, -1, -1, 5, -1, 6, 6, -1, 7, -1, -1, 7, 8, -1, -1, -1, -1, -1};
        root = BuildTree.buildTreeLevel(input);
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    @Test
    void preOrder() {
        BuildTree.printLevelLn(root);
        RecursiveTreeTraversal.preOrder(root);
    }

    @Test
    void inOrder() {
        RecursiveTreeTraversal.inOrder(root);
    }
}