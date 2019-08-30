

public class arrayToBST{
	public static void main(String args[]){
		int[] arr={-10,-3,0,5,9};
		
		if(arr==null || arr.length==0)
			return null;
	
		return makeBST(arr,0,arr.length-1);
	}
}

public TreeNode makeBST(int[] arr, int left, int right){
	if(left>right)
		return null;
	
	int mid=left+(right-left)/2;
	
	TreeNode t=new TreeNode(arr[mid]);
	t.left=makeBST(arr, left, mid-1);
	t.right=makeBST(arr, mid+1, right);
	
	return TreeNode;
}

	public class TreeNode {
		int value;
		TreeNode left;
		TreeNode right;
		Treenode(int x){
			value=x;
		}
	}