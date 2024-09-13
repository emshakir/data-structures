package com.ms.data.structures.trees.binarytree.playground;

import java.util.ArrayList;
import java.util.List;

import javax.swing.RootPaneContainer;

import com.ms.data.structures.trees.binarytree.TreeNode;

public class LowestCommonAncestors {

	public static void main(String[] args) {

	}
	
	public static TreeNode getLCAOpt(TreeNode root, TreeNode p, TreeNode q) {
		
		if(root == null || root == p || root == q) {
			return root;
		}
		
		TreeNode left = getLCA(root.left, p, q);
		TreeNode right = getLCA(root.right, p, q);
		
		if(left == null) {
			return right;
		}
		
		if(right == null) {
			return left;
		}
		
		return root;
		
	}
	
	
	public static TreeNode getLCA(TreeNode node, TreeNode p, TreeNode q) {
		List<TreeNode> pNodes = new ArrayList<>();
		List<TreeNode> qNodes = new ArrayList<>();
		getNodes(node, p, pNodes);
		getNodes(node, q, qNodes);
		
		int  i =0;
		while(i < pNodes.size() && i < qNodes.size()) {
			if(!pNodes.get(i).equals(qNodes.get(i))) {
				break;
			}	
			i++;
		}
		return pNodes.get(i - 1);
	}

	private static boolean getNodes(TreeNode root, TreeNode p, List<TreeNode> pNodes) {
		if(root == null) {
			return false;
		}
		pNodes.add(root);
		if(root == p) {
			return true;
		}
		
		boolean left = getNodes(root.left, p, pNodes);
		boolean right = getNodes(root.right, p, pNodes);
		if(left || right) {
			return true;
		}
		pNodes.remove(pNodes.size() - 1);
		return false;
		
	}



}
