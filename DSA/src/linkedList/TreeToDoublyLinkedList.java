package linkedList;

import tree.TreeNode;
import tree.TreeUtil;

public class TreeToDoublyLinkedList {
	public static void makeLeftLink(TreeNode root) {
		Node prev = null;
		if(root == null) return;
		makeLeftLink(root.left);
		root.left = (TreeNode) prev;
		prev = root;
		makeLeftLink(root.right);
		
	}
	public static Node makeRightlink(TreeNode root) {
		while(root != null && root.right != null) {
			root = root.right;
		}
		Node prev=null;
		while(root != null && root.left != null) {
			prev = root;
			root = root.left;
			root.right = (TreeNode) prev;
		}
		return root;
	}
	public static DoublyLinkedList makeList(TreeNode root) {
		DoublyLinkedList head = new DoublyLinkedList(0);
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeUtil treeUtil = new  TreeUtil();
		TreeNode root = treeUtil.makeBalancedTree(new int[] {1,2,3,4,5,6,7}, 0, 6);
		

	}

}
