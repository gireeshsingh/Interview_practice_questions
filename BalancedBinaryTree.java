/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return helper(root)==Integer.MAX_VALUE? false: true;
    }
    public int helper(TreeNode root){
        if(root==null) return 0;
        int leftHeight=helper(root.left);
        int rightHeight=helper(root.right);
        if(leftHeight!=Integer.MAX_VALUE && rightHeight!=Integer.MAX_VALUE && Math.abs(leftHeight-rightHeight)<2) return Math.max(leftHeight, rightHeight)+1;
        return Integer.MAX_VALUE;
    }
}