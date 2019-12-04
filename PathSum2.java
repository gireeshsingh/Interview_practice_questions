/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class PathSum2 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer> arr=new ArrayList<Integer>();
        return helper(root, sum, arr);
    }
    public List<List<Integer>> helper(TreeNode root, int sum, List<Integer> arr){
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        if(root==null) return res;
        else if(root.left==null && root.right==null){
            if(sum-root.val==0) {arr.add(root.val); res.add(arr);} 
        }
        else{
            arr.add(root.val);
            if(root.left!=null) res.addAll(helper(root.left, sum-root.val, new ArrayList<Integer>(arr)));
            if(root.right!=null) res.addAll(helper(root.right, sum-root.val, new ArrayList<Integer>(arr)));
        }
        return res;
    }
}