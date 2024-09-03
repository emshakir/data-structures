package com.ms.data.structures.trees.binaryTrees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RootToLeafPathTest {

    TreeNode root;

    @BeforeEach
    void setUp() {
        int[] input = {1, 2, 3, 4, 6, -1, -1, -1, -1, -1, -1};
        root = BuildTree.buildTreeLevel(input);
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    @Test
    void rootToLeafPath() {
        List<List<Integer>> res = RootToLeafPath.rootToLeafPath(root);
        System.out.println(res);
    }
}