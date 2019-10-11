/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BinaryLevelOrderTraversal2 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null) return list;
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> l=new ArrayList<>();
            while(size>0){
                TreeNode tn=q.poll();
                if(tn!=null){
                    l.add(tn.val);
                    q.add(tn.left);
                    q.add(tn.right);
                }
                size--;
            }
            if(l.size()>0) list.add(l);
        }
        Collections.reverse(list);
        return list;
    }
}