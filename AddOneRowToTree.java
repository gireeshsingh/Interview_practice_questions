/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class AddOneRowToTree {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if(d==1){
            TreeNode temp=new TreeNode(v);
            temp.left=root;
            return temp;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int depth=1;
        while(q.size()>0){
            int size=q.size();
            while(--size>-1){
                TreeNode temp=q.poll();
                if(depth==d-1){
                    TreeNode ok=new TreeNode(v);
                    ok.left=temp.left;
                    temp.left=ok;
                    ok=new TreeNode(v);
                    ok.right=temp.right;
                    temp.right=ok;
                }
                else{
                    if(temp.left!=null) q.add(temp.left);
                    if(temp.right!=null) q.add(temp.right);
                }
            }
            depth++;
        }
        return root;
    }
}