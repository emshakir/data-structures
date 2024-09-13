package com.ms.data.structures.trees.binaryTrees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ms.data.structures.trees.binarytree.BuildTree;
import com.ms.data.structures.trees.binarytree.IterativeTreeTraversal;
import com.ms.data.structures.trees.binarytree.TreeNode;

class IterativeTreeTraversalTest {

    TreeNode root;

    @BeforeEach
    void setUp() {
        int[] input = {1, 2, 4, 3, 4, 5, -1, -1, -1, -1, 5, -1, 6, 6, -1, 7, -1, -1, 7, -1, 8, -1, -1, -1, -1};
        root = BuildTree.buildTreeLevel(input);
        System.out.println("~~~~~~~~~~~~~~~");
    }

    @Test
    void preOrder() {
        //1 2 3 4 5 6 7 4 5 6 7 8
        BuildTree.printLevelLn(root);
        IterativeTreeTraversal.preOrder(root);
    }

    @Test
    void inOrder() {
        //3 2 4 6 7 5 1 5 8 7 6 4
        IterativeTreeTraversal.inOrder(root);
    }
}