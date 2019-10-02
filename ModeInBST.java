/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class ModeInBST {
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    
    public int[] findMode(TreeNode root) {
        int[] result = new int[0];
        if(root==null) return result;
        helper(root);
        int max=Collections.max(hm.values());
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(Map.Entry<Integer,Integer> entry : hm.entrySet())
            if(entry.getValue()==max) arr.add(entry.getKey());
        result = new int[arr.size()];
        for(int i=0;i<arr.size();i++)
            result[i]=arr.get(i);
        return result;
    }
    
    public void helper(TreeNode root){
        if(root == null) return;
        hm.put(root.val, hm.getOrDefault(root.val,0)+1);
        helper(root.left);
        helper(root.right);
    }
}