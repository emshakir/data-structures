package com.ms.data.structures.trees.binaryTrees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZigZagTreeTest {

    TreeNode root;

    @BeforeEach
    void setUp() {
        int[] input = {3, 9, 20, -1, -1, 15, 7, -1, -1, -1, -1};
        root = BuildTree.buildTreeLevel(input);
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    @Test
    void zigzagLevelOrder() {
        List<List<Integer>> res = ZigZagTree.zigzagLevelOrder(root);
        System.out.println(res);
    }
}