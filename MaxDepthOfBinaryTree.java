/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class MaxDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        else return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }
}