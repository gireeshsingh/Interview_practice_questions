/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    HashSet<Integer> set;
        
    public boolean findTarget(TreeNode root, int k) {
        set = new HashSet<Integer>();
        return treeToMap(root, k);
    }
    
    public boolean treeToMap(TreeNode root, int k){
        if(root==null) return false;
        if(set.contains(k-root.val)) return true;
        set.add(root.val);
        return treeToMap(root.left, k) || treeToMap(root.right, k);
    }
}