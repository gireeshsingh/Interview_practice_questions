/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class MinAbsoluteDifferenceInBST {
    int diff = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        helper(root.left, root.val, root.val);
        helper(root.right, root.val, root.val);
        return diff;
    }
    
    public void helper(TreeNode root, int max, int min){
        if(root == null)
            return;
        diff = Math.min(Math.abs(root.val-max), diff);
        diff = Math.min(Math.abs(root.val-min), diff);
        helper(root.left, root.val, min);
        helper(root.right, max, root.val);
    }
}