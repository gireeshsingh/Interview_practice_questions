/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class FlattenBinaryTreeToLinkedList {
    public void flatten(TreeNode root) {
        helper(root);
    }
    public TreeNode helper(TreeNode root){
        if(root==null) return null;
        if(root.left==null && root.right==null) return root;
        TreeNode left=helper(root.left);
        TreeNode right=helper(root.right);
        root.right=left;
        TreeNode temp=root;
        while(temp.right!=null) temp=temp.right;
        temp.right=right;
        root.left=null;
        return root;
    }
}