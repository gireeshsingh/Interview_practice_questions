/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class KthSmallestElementInBST {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> nums=new ArrayList<Integer>();
        inorder(root, nums);
        return nums.get(k-1);
    }
    public void inorder(TreeNode root, List<Integer> nums){
        if(root==null) return;
        inorder(root.left, nums);
        nums.add(root.val);
        inorder(root.right, nums);
    }
}