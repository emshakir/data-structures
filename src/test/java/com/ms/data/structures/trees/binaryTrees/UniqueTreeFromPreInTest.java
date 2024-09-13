package com.ms.data.structures.trees.binaryTrees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ms.data.structures.trees.binarytree.BuildTree;
import com.ms.data.structures.trees.binarytree.TreeNode;
import com.ms.data.structures.trees.binarytree.UniqueTreeFromPreIn;

import static org.junit.jupiter.api.Assertions.*;

class UniqueTreeFromPreInTest {

    TreeNode root;

    @BeforeEach
    void setUp() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, -1, -1, -1, -1, -1, -1, -1, -1};
        root = BuildTree.buildTreeLevel(input);
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    @Test
    void uniqueTreeFromPreIn() {
        int[] pre = {1, 2, 4, 5, 3, 6, 7};
        int[] in = {4, 2, 5, 1, 6, 3, 7};
        TreeNode root = UniqueTreeFromPreIn.uniqueTreeFromPreIn(pre, in);
        BuildTree.printLevelLn(root);
    }
}