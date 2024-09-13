package com.ms.data.structures.trees.bst;


import com.ms.data.structures.trees.binarytree.TreeNode;

public class BinarySearchTree {

    public static TreeNode searchBST(TreeNode root, int val) {

        if (root == null || root.val == val) {
            return root;
        }
        return (val < root.val)
                ? searchBST(root.left, val)
                : searchBST(root.right, val);
    }

    public static TreeNode searchBST_(TreeNode root, int val) {

        TreeNode temp = root;
        while (temp != null && temp.val != val) {
            temp = (val < root.val) ? root.left : root.right;
        }
        return temp;
    }
}
