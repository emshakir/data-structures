package com.ms.data.structures.trees.binaryTrees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ms.data.structures.trees.binarytree.BuildTree;
import com.ms.data.structures.trees.binarytree.RecursiveTreeTraversal;
import com.ms.data.structures.trees.binarytree.TreeNode;

class RecursiveTreeTraversalTest {

    TreeNode root;

    @BeforeEach
    void setUp() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, -1, -1, -1, -1, -1, -1, -1, -1};
        root = BuildTree.buildTreeLevel(input);
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    @Test
    void preOrder() {
        BuildTree.printLevelLn(root);
        System.out.print("Pre Order: ");
        RecursiveTreeTraversal.preOrder(root);
    }

    @Test
    void inOrder() {
        System.out.print("In Order: ");
        RecursiveTreeTraversal.inOrder(root);
    }

    @Test
    void postOrder() {
        System.out.print("Post Order: ");
        RecursiveTreeTraversal.postOrder(root);
    }
}