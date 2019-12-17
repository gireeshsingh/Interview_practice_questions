/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root!=null){
            List<Integer> result1 = new ArrayList<Integer>();
            List<Integer> result2 = new ArrayList<Integer>();
            result.add(root.val);
            result1=preorderTraversal(root.left);
            result2=preorderTraversal(root.right);
            if(result1!=null)
                result.addAll(result1);
            if(result2!=null)
                result.addAll(result2);
        }
        return result;
    }
}