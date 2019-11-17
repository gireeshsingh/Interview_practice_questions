/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        List<TreeNode> q=new ArrayList<>();
        if(root==null) return list;
        q.add(root);
        list.add(root.val);
        while(q.size()>0){
            int size=q.size();
            while(--size>-1){
                TreeNode temp=q.get(0);
                q.remove(0);
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            if(q.size()>0) list.add(q.get(q.size()-1).val);
        }
        return list;
    }
}