/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class DiameterOfBinaryTree {
    int ans=1;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return ans-1;
    }
    public int dfs(TreeNode root){
        if(root==null) return 0;
        int L=dfs(root.left);
        int R=dfs(root.right);
        ans=Math.max(ans, L+R+1);
        return Math.max(L,R)+1;
    }
}