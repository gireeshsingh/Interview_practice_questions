class TreeNode {
	int value;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){
		value=x;
	}
}

public class arrayToBST{
	public static void main(String args[]){
		int[] arr={-10,-3,0,5,9};
		
		if(arr==null || arr.length==0)
			return;
		
		arrayToBST a2bst= new arrayToBST();
		TreeNode tn=a2bst.makeBST(arr,0,arr.length-1);
		
		a2bst.printTree(tn);
		
	}
	
	public void printTree(TreeNode tn){
		if(tn!=null){
			System.out.println(tn.value);
			printTree(tn.left);
			printTree(tn.right);
		}
	}
	
	public TreeNode makeBST(int[] arr, int left, int right){
		if(left>right)
			return null;
		
		int mid=left+(right-left)/2;
		
		TreeNode t=new TreeNode(arr[mid]);
		t.left=makeBST(arr, left, mid-1);
		t.right=makeBST(arr, mid+1, right);
		
		return t;
	}
}
