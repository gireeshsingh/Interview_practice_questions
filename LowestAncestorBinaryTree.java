/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
*/
class LowestAncestorBinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //System.out.println(root.val);
        if(root==null) return null;
        if(root==p || root==q) return root;

        TreeNode lnode=lowestCommonAncestor(root.left,p,q);
        TreeNode rnode=lowestCommonAncestor(root.right,p,q);
        
        if(lnode!=null && rnode!=null) return root;
        else if(lnode==null && rnode==null) return null;
        
        return lnode!=null?lnode:rnode;
    }
}