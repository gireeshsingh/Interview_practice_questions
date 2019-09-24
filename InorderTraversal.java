/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root!=null){
            List<Integer> result1 = new ArrayList<Integer>();
            List<Integer> result2 = new ArrayList<Integer>();
            result1=inorderTraversal(root.left);
            result2=inorderTraversal(root.right);
            if(result1!=null)
                result.addAll(result1);
            result.add(root.val);
            if(result2!=null)
                result.addAll(result2);
        }
        return result;
    }
}