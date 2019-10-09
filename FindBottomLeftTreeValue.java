/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class FindBottomLeftTreeValue {
    int maxD=-1, value=Integer.MIN_VALUE;
    public int findBottomLeftValue(TreeNode root) {
        helper(root,0);
        return value;
    }
    public void helper(TreeNode root, int depth){
        if(root==null) return;
        if(root.left==null && root.right==null && depth>maxD)       
        {maxD=depth;value=root.val;return;}
        helper(root.left, depth+1);
        helper(root.right, depth+1);
    }
}