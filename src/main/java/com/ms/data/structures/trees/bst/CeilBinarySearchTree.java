package com.ms.data.structures.trees.bst;

import com.ms.data.structures.trees.binarytree.TreeNode;

public class CeilBinarySearchTree {

    public static int findCeil(TreeNode root, int key) {
        if (root == null) return -1;

        // If CURR VAL is >= KEY a possible answer, there could be other answers as well move left
        int ans = -1;
        TreeNode temp = root;
        while(temp != null) {
            if(temp.val >= key) {
                ans = temp.val;
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        return ans;
    }
}