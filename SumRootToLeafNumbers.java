/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SumRootToLeafNumbers {
    List<String> res=new ArrayList<String>();
    public int sumNumbers(TreeNode root) {
        res=helper(root, "");
        int sum=0;
        for(String str: res){
            sum+=Integer.parseInt(str);
        }
        return sum;
    }
    public List<String> helper(TreeNode root, String str){
        List<String> res=new ArrayList<String>();
        if(root==null) return res;
        if(root.left==null&&root.right==null) {res.add(str+root.val); return res;}
        res.addAll(helper(root.left, str+root.val));
        res.addAll(helper(root.right, str+root.val));
        return res;
    }
}