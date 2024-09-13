package com.ms.data.structures.trees.binarytree;


/**
 * <a href="https://leetcode.com/problems/binary-tree-maximum-path-sum/description/">124. Binary Tree Maximum Path Sum</a>
 */
public class MaximumPathSum {

    public static int maxPathSum(TreeNode root) {
        int[] max = new int[1];
        return maxPathSumHelper(root, max);
    }

    private static int maxPathSumHelper(TreeNode root, int[] max) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(0, maxPathSumHelper(root.left, max));
        int right = Math.max(0, maxPathSumHelper(root.right, max));
        int currMax = root.val + left + right;
        max[0] = Math.max(max[0], currMax);
        return root.val + Math.max(left, right);
    }

    public static int maxPathSumOther(TreeNode root) {
        Pair result = maxPathSumOtherHelper(root);
        return result.sum;
    }

    private static Pair maxPathSumOtherHelper(TreeNode root) {
        if (root == null) {
            Pair res = new Pair(Integer.MIN_VALUE, 0);
            return res;
        }
        Pair left = maxPathSumOtherHelper(root.left);
        Pair right = maxPathSumOtherHelper(root.right);
        int currSum = root.val + left.nodeValue + right.nodeValue;
        int maxSum = Math.max(Math.max(0, currSum), Math.max(left.sum, right.sum));
        int currNode = root.val + Math.max(left.nodeValue, right.nodeValue);
        Pair res = new Pair(maxSum, currNode);
        return res;
    }

    static class Pair {
        int sum;
        int nodeValue;

        public Pair(int sum, int nodeValue) {
            this.sum = sum;
            this.nodeValue = nodeValue;
        }
    }
}
