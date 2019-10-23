/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class DeleteNodesAndReturnForest {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        HashSet<Integer> del=new HashSet<>();
        List<TreeNode> res=new ArrayList<TreeNode>();
        for(int i: to_delete) del.add(i);
        root=helper(root, del, res);
        if(root!=null) res.add(root);
        return res;
    }
    public TreeNode helper(TreeNode root, HashSet<Integer> del, List<TreeNode> res){
        if(root==null) return null;
        root.left=helper(root.left, del, res);
        root.right=helper(root.right, del, res);
        if(del.contains(root.val)){
            if(root.left!=null && !del.contains(root.left.val)) res.add(root.left);
            if(root.right!=null && !del.contains(root.right.val)) res.add(root.right);
            root=null;
        }
        return root;
    }
}