/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class MinDepth {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        return helper(root, 1);
    }
    public int helper(TreeNode root, int depth){
        if(root==null) return Integer.MAX_VALUE;
        if(root.left==null && root.right==null) return depth;
        return Math.min(helper(root.left, depth+1), helper(root.right, depth+1));
    }
}