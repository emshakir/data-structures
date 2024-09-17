package com.ms.data.structures.trees.binarytree.playground;

import com.ms.data.structures.trees.binarytree.TreeNode;

import java.util.*;

public class VerticalOrderTraversal {


    public List<List<Integer>> getVerticalNodes(TreeNode root) {
        if (root == null) {
            return null;
        }
        Map<Integer, Map<Integer, Set<Integer>>> map = new TreeMap<>();
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(root, 0, 0));
        while (!q.isEmpty()) {
            Node top = q.poll();
            TreeNode treeNode = top.treeNode;
            int vertex = top.vertex;
            int level = top.level;
            map.putIfAbsent(vertex, new TreeMap<>());
            map.get(vertex).putIfAbsent(level, new TreeSet<>());
            map.get(vertex).get(level).add(root.val);

            if (treeNode.left != null) {
                q.add(new Node(root.left, vertex - 1, level + 1));
            }

            if (treeNode.right != null) {
                q.add(new Node(root.right, vertex + 1, level + 1));
            }

        }

        List<List<Integer>> answer = new ArrayList<>();
        for (Map<Integer, Set<Integer>> vertexValues : map.values()) {
            List<Integer> list = new ArrayList<>();
            for (Set<Integer> nodeValues : vertexValues.values()) {
                list.addAll(nodeValues);
            }
            answer.add(list);
        }
        return answer;
    }

    private static class Node {
        TreeNode treeNode;
        int vertex;
        int level;

        public Node(TreeNode treeNode, int vertex, int level) {
            this.treeNode = treeNode;
            this.vertex = vertex;
            this.level = level;
        }
    }

}
