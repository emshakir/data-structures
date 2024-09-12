package com.ms.data.structures.trees.binarySearchTree;

import com.ms.data.structures.trees.binaryTrees.BuildTree;
import com.ms.data.structures.trees.binaryTrees.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthSpecificElementTest {

    TreeNode root;

    @BeforeEach
    void setUp() {
        int[] input = {2, 1, 4, -1, -1, 3, 6, -1, -1, 5, -1, -1, -1, -1};
        root = BuildTree.buildTreeLevel(input);
        System.out.println("~~~~~~~~~~~~~~~");
    }

    @Test
    void kthSmallestElementIte() {
        KthSpecificElement.kthSmallestElementIte(root, 3);
    }
}