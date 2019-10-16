/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class DeleteNodeInBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        else if(root.val<key) root.right=deleteNode(root.right, key);
        else if(key<root.val) root.left=deleteNode(root.left, key);
        else{
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;
            TreeNode temp=root;
            temp=temp.right;
            while(temp.left!=null) temp=temp.left;
            root.val=temp.val;
            root.right = deleteNode(root.right,temp.val);
        }
        return root;
    }
}