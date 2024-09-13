package com.ms.data.structures.trees.binaryTrees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ms.data.structures.trees.binarytree.BuildTree;
import com.ms.data.structures.trees.binarytree.TreeNode;
import com.ms.data.structures.trees.binarytree.VerticalOrderTraversal;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VerticalOrderTraversalTest {

    TreeNode root;

    @BeforeEach
    void setUp() {
        int[] input = {3, 1, 4, 0, 2, 2, -1, -1, -1, -1, -1, -1, -1};
        root = BuildTree.buildTreeLevel(input);
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    @Test
    void vertical() {
        List<List<Integer>> res = VerticalOrderTraversal.verticalUsingTreeMap(root);
        System.out.println(res);
    }
}