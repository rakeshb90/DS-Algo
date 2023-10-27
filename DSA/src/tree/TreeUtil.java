package tree;

public class TreeUtil {
	public static TreeNode reverseTree(TreeNode root) {
		if(root==null || (root.left==null && root.right==null))
			return root;
		// swap root left,right
		TreeNode tempNode = root.left;
		root.left = root.right;
		root.right = tempNode;
		// reverse root's sub tree
		root.left = reverseTree(root.left);
		root.right = reverseTree(root.right);
		
		return root;
	}
	public static TreeNode makeTree(int[] arr,int index) {
		TreeNode root=null;
		if( index>= arr.length || arr[index] == -1 ) {
			index++;
			return root;	
		}
		
		root = new TreeNode(arr[index]);
		index++;
		root.left = makeTree(arr,index+1);
		root.right = makeTree(arr,index+1);
		return root;
	}
	 public TreeNode makeBalancedTree(int[] nums,int startIndex,int endIndex){
	        if(startIndex > endIndex)
	        return null;
	        int mid = (startIndex+endIndex)/2;
	        TreeNode root = new TreeNode(nums[mid]);
	        root.left = makeBalancedTree(nums,startIndex,mid-1);
	        root.right = makeBalancedTree(nums,mid+1,endIndex);
	        return root;
	    }
	
	public static void showNode(TreeNode root) {
		if(root==null)
			return;
		System.out.print(root.data+" , ");
		showNode(root.left);
		showNode(root.right);
	}
	// Merge two Binary tree 
	 public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
	        if(root1 == null && root2==null)
	        return null;
	        
	         TreeNode root = null;
	        
	        if(root1 == null){
	          root = root2;
	          return root;
	        }
	        
	        if(root2 == null){
	             root = root1;
	          return root;
	        }
	        
	     root = new TreeNode(root1.data += root2.data);
	     root.left = mergeTrees(root1.left,root2.left);
	     root.right = mergeTrees(root1.right,root2.right);
	     
	     return root;
	        
	    }

}
