/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BinaryTreeZigZagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root==null) return res;
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        boolean flip=true;
        while(q.size()!=0){
            int size=q.size();
            flip=!flip;
            List<Integer> list=new ArrayList<Integer>();
            while(size>0){
                TreeNode temp=q.poll();
                System.out.println(temp.val);
                list.add(temp.val);
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
                size--;
            }
            if(flip) Collections.reverse(list);
            res.add(list);
        }
        return res;
    }
}