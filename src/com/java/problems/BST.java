package com.java.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class CheckTree {
	void inorder(TreeNode node, List<Integer> list) {
		if (node != null) {
			inorder(node.left, list);
			list.add(node.data);
			inorder(node.right, list);
		}
	}

	TreeNode rootNode;
	TreeNode prev;

	boolean isBST() {
		prev = null;
		return isBST(rootNode);
	}

	boolean isBST(TreeNode root) {
  		if (root != null) {
 			if (!isBST(root.left))
				return false;
			if (prev != null && root.data <= prev.data) {
 				return false;
			}
			prev = root;
			return isBST(root.right);
		}
		return true;
	}
}

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	TreeNode(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

class TreeWorks {

	static TreeNode buildTree(String str) {

		if (str.length() == 0 || str.charAt(0) == 'N') {
			return null;
		}

		String ip[] = str.split(" ");
		TreeNode root = new TreeNode(Integer.parseInt(ip[0]));

		Queue<TreeNode> queue = new LinkedList<>();

		queue.add(root);

		int i = 1;
		while (queue.size() > 0 && i < ip.length) {

			TreeNode currNode = queue.peek();
			queue.remove();

			String currVal = ip[i];

			if (!currVal.equals("N")) {
				currNode.left = new TreeNode(Integer.parseInt(currVal));
				queue.add(currNode.left);
			}

			i++;
			if (i >= ip.length)
				break;

			currVal = ip[i];

			if (!currVal.equals("N")) {
				currNode.right = new TreeNode(Integer.parseInt(currVal));
				queue.add(currNode.right);
			}
			i++;
		}

		return root;
	}

	public static void main(String[] args) throws IOException {
 		String s = "3 2 5 1 4";
		TreeNode root = buildTree(s);
		CheckTree g = new CheckTree();
		if (g.isBST(root))
			System.out.println(1+" true");
		else
			System.out.println(0+" false");
	}
}
