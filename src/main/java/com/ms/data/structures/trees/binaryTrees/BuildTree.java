package com.ms.data.structures.trees.binaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class BuildTree {

    public static int idx = 0;

    public static Node buildTreePre(int[] A) {
        int element = A[idx++];
        if (element == -1) {
            return null;
        }
        Node root = new Node(element);
        root.left = buildTreePre(A);
        root.right = buildTreePre(A);
        return root;
    }

    public static Node buildTreeLevel(int[] A) {
        int i = 0;
        Queue<Node> q = new LinkedList<>();
        Node root = new Node(A[i++]);
        q.offer(root);
        while (!q.isEmpty()) {
            Node current = q.poll();
            if(A.length == i) {
                break;
            }
            int leftNodeVal = A[i++];
            if (leftNodeVal != -1) {
                Node leftNode = new Node(leftNodeVal);
                q.offer(leftNode);
                current.left = leftNode;
            }

            int rightNodeVal = A[i++];
            if (rightNodeVal != -1) {
                Node rightNode = new Node(rightNodeVal);
                q.offer(rightNode);
                current.right = rightNode;
            }
        }
        printLevelLn(root);
        return root;
    }

    public static void printLevelLn(Node root) {
        if (root == null) {
            System.out.println("No tree present!!");
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        while (!q.isEmpty()) {
            Node current = q.poll();
            if (current == null) {
                if (q.isEmpty()) {
                    break;
                }
                q.offer(null);
                System.out.println();
            } else {
                print(current.val);
                Node left = current.left;
                if (left != null) {
                    q.offer(left);
                }

                Node right = current.right;
                if (right != null) {
                    q.offer(right);
                }
            }
        }
    }

    public static void printLevel(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        print(root.val);
        while (!q.isEmpty()) {
            Node curr = q.poll();
            Node left = curr.left;
            if (left != null) {
                print(left.val);
                q.offer(left);
            }

            Node right = curr.right;
            if (right != null) {
                print(right.val);
                q.offer(right);
            }
        }

    }

    private static void print(int val) {
        System.out.print(val + " ");
    }
}
