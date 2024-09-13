<<<<<<< HEAD:src/main/java/com/ms/data/structures/trees/bst/InsertNodeBST.java
package com.ms.data.structures.trees.bst;

import com.ms.data.structures.trees.binarytree.TreeNode;
=======
package com.ms.data.structures.trees.binarySearchTree;

import com.ms.data.structures.trees.binaryTrees.TreeNode;
>>>>>>> bdb73e8af5396c37971794d0ac34bf4e4d89a491:src/main/java/com/ms/data/structures/trees/binarySearchTree/InsertNodeBST.java

public class InsertNodeBST {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (root.val > val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }

    public TreeNode insertIntoBSTO(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        TreeNode curr = root;
        while (true) {
            if (curr.val > val) {
                if (curr.left != null) {
                    curr = curr.left;
                } else {
                    curr.left = new TreeNode(val);
                    break;
                }
            } else {
                if (curr.right != null) {
                    curr = curr.right;
                } else {
                    curr.right = new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }
}
