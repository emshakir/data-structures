package com.ms.data.structures.trees.binaryTrees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ms.data.structures.trees.binarytree.BoundaryTraversal;
import com.ms.data.structures.trees.binarytree.BuildTree;
import com.ms.data.structures.trees.binarytree.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BoundaryTraversalTest {

    TreeNode root;

    @BeforeEach
    void setUp() {
        int[] input = {10, 5, 20, 3, 8, 18, 25, -1, -1, 7, -1, -1, -1, -1, -1, -1, -1};
        root = BuildTree.buildTreeLevel(input);
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    @Test
    void boundaryTraversal() {
        BuildTree.printLevelLn(root);
        List<Integer> res = BoundaryTraversal.boundaryTraversal(root);
        System.out.println(res);
    }
}