/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class IncreasingBST {
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> arrList= new ArrayList<Integer>();
        helper(root, arrList);
        TreeNode t=new TreeNode(0), head=t;
        for(int i: arrList){
            t.right=new TreeNode(i);
            t=t.right;
        } 
        return head.right;
    }
    
    public void helper(TreeNode root, ArrayList<Integer> arrList){
        if(root==null) return;
        helper(root.left, arrList);
        arrList.add(root.val);
        helper(root.right, arrList);
    }
}