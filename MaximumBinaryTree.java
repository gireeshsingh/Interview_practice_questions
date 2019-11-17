/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length==0) return null;
        int max_index=0;
        for(int i=1;i<nums.length;i++) if(nums[i]>nums[max_index]) max_index=i;
        TreeNode node=new TreeNode(nums[max_index]);
        node.left=constructMaximumBinaryTree(Arrays.copyOfRange(nums, 0, max_index));
        node.right=constructMaximumBinaryTree(Arrays.copyOfRange(nums, max_index+1, nums.length));
        return node;
    }
}