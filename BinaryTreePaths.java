/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
        if(root==null) return res;
        if(root.left==null&&root.right==null){res.add(""+root.val); return res;}
        res=helper(root.left,""+root.val);
        res.addAll(helper(root.right,""+root.val));
        return res;
    }
    
    public List<String> helper(TreeNode root, String sb){
        List<String> res = new ArrayList<String>();
        if(root==null) return res;
        if(root.left==null&&root.right==null) res.add(sb+"->"+root.val);
        res.addAll(helper(root.left, sb+"->"+root.val));
        res.addAll(helper(root.right, sb+"->"+root.val));
        return res;
    }
}