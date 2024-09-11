package com.ms.data.structures.trees.binaryTrees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SerializeAndDeserializeTest {

    TreeNode root;

    @BeforeEach
    void setUp() {
        int[] input = {1, 2, 3, -1, -1, 4, 5, -1, -1, -1, -1};
        root = BuildTree.buildTreeLevel(input);
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    @Test
    void serialize() {
        BuildTree.printLevelLn(root);
        String encoded = SerializeAndDeserialize.serialize(root);
        TreeNode root = SerializeAndDeserialize.deserialize(encoded);
        BuildTree.printLevelLn(root);
    }
}