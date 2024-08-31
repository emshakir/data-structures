package com.ms.data.structures.trees.binaryTrees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MirrorTreeTest {

    TreeNode root;

    @BeforeEach
    void setUp() {
        int[] input = {1, 2, 2, 3, 4, 4, 3, -1, -1, -1, -1, -1, -1, -1, -1};
        root = BuildTree.buildTreeLevel(input);
        System.out.println("~~~~~~~~~~~~~~~");
    }

    @Test
    void isSymmetric() {
        MirrorTree.isSymmetric(root);
    }
}