/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SecondMinimumNodeInBinaryTree {
    public int findSecondMinimumValue(TreeNode root) {
        HashSet<Integer> hs=new HashSet<>();
        dfs(root,hs);
        int min=root.val;
        long max=Long.MAX_VALUE;
        for(int v: hs) if(min<v&&v<max) max=v;
        return max<Long.MAX_VALUE?(int)max:-1;
    }
    public void dfs(TreeNode root, HashSet<Integer> hs){
        if(root==null) return;
        hs.add(root.val);
        dfs(root.left, hs);
        dfs(root.right, hs);
    }
}