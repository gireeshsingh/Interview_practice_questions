/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class countUnivals {
    int globalcount=0;
    public int countUnivalSubtrees(TreeNode root) {
        if(root!=null){
            if(isUnival(root,root.val)){
                globalcount++;
            }
            countUnivalSubtrees(root.left);
            countUnivalSubtrees(root.right);
        }
        return globalcount;
    }
    
    public boolean isUnival(TreeNode root, int value){
        if(root==null){
            return true;
        }
        if(root!=null && root.val==value && isUnival(root.left, value) && isUnival(root.right, value))
            return true;
        return false;
    }
}