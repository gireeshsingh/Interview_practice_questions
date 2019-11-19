/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class CousinsInBinaryTree {
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null) return false;
        List<TreeNode> q=new ArrayList<TreeNode>();
        q.add(root);
        while(q.size()>0){
            int size=q.size();
            while(--size>-1){
                TreeNode temp=q.get(0);
                q.remove(0);
                if(temp.left!=null && temp.right!=null && ((temp.left.val==x && temp.right.val==y) || (temp.left.val==y && temp.right.val==x))) return false;
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            boolean xfound=false, yfound=false;
            for(TreeNode node: q){
                if(node.val==x) xfound=true;
                else if(node.val==y) yfound=true;
            }
            if(xfound && yfound) return true;
            if(xfound||yfound) return false;
        }
        return false;
    }
}