/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class RangeSumOfBST {
    int sum=0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root==null)
            return sum;
        totalSum(root,L,R);
        return sum;
    }
    
    public void totalSum(TreeNode root, int L, int R){
        if(L<=root.val && root.val<=R)
            sum+=root.val;
        if(L<=root.val && root.left!=null)
            totalSum(root.left,L,R);
        if(root.val<=R && root.right!=null)
            totalSum(root.right,L,R);
    }
}