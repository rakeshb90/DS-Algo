package tree;

public class HeightOfTree {
	public static int maxDepth(TreeNode root) {
        if(root==null)
        return 0;
        if(root.left==null && root.right==null)
        return 1;
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return Math.max(leftHeight,rightHeight)+1;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input: root = [3,9,20,null,null,15,7]
//				Output: 3
//				Example 2:
//
//				Input: root = [1,null,2]
//				Output: 2
		int[] arr = {3,9,20,-1,-1,15,7};
		TreeNode root = TreeUtil.makeTree(arr,0);
		System.out.println("Maximum Depth: "+maxDepth(root));

	}

}
