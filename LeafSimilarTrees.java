/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return leafList(root1).equals(leafList(root2));
    }
    
    public ArrayList<Integer> leafList(TreeNode root){
        ArrayList<Integer> l1=new ArrayList<Integer>();
        if(root==null) return l1;
        if(root.left==null && root.right==null) l1.add(root.val);
        l1.addAll(leafList(root.left));
        l1.addAll(leafList(root.right));
        return l1;
    }
}