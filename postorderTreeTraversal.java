/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class postorderTreeTraversal {
    ArrayList<Integer> arr=new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null){
            return arr;
        }
        if(root.left!=null){
            postorderTraversal(root.left);
        }
        if(root.right!=null){
            postorderTraversal(root.right);
        }
        
        arr.add(root.val);
        return arr;
    }
}