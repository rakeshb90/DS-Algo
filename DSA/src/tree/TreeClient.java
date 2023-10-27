package tree;

public class TreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,9,20,-1,-1,15,7,-1,-1,-1,-1};
		TreeNode root = TreeUtil.makeTree(arr,0);
		System.out.println("************Origional Tree***********");
		TreeUtil.showNode(root);
		System.out.println();
		System.out.println("************Reverse Tree***********");
		root = TreeUtil.reverseTree(root);
		TreeUtil.showNode(root);
		TreeUtil treeUtil = new TreeUtil();
		TreeNode root1 = treeUtil.makeBalancedTree(new int[] {1,2,4,5,8,9,10},0,6);
		System.out.println();
		System.out.println("************Origional Tree***********");
		TreeUtil.showNode(root1);
		System.out.println();
		System.out.println("************Reverse Tree***********");
		TreeUtil.showNode(TreeUtil.reverseTree(root1));
		

	}

}
