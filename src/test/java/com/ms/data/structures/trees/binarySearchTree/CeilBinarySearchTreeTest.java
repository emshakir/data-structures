package com.ms.data.structures.trees.binarySearchTree;

import com.ms.data.structures.trees.binaryTrees.BuildTree;
import com.ms.data.structures.trees.binaryTrees.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CeilBinarySearchTreeTest {

    TreeNode root;

    @BeforeEach
    void setUp() {
        int[] input = {10, 5, 11, 4, 7, -1, -1, -1, -1, -1, 8, -1, -1};
        root = BuildTree.buildTreeLevel(input);
        System.out.println("~~~~~~~~~~~~~~~");
    }

    @Test
    void findCeil() {
        int res = CeilBinarySearchTree.findCeil(root, 10);
        System.out.println(res);
    }
}