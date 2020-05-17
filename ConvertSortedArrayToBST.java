/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null || nums.length==0) return null;
        int length = nums.length;
        TreeNode root = new TreeNode(nums[length/2]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, length/2));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, length/2+1, length));
        return root;
    }
}