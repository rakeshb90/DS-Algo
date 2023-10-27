package tree;

import linkedList.Node;

public class TreeNode extends Node{
	public int data;
	public TreeNode left;
	public TreeNode right;
	TreeNode(){}
	TreeNode(int data){
		this.data = data;
	}
}
