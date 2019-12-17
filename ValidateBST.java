/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.addAll(inOrderBST(root));   
        System.out.println(arr);
        return checkInOrderList(arr);
    }
    
    public boolean checkInOrderList(ArrayList<Integer> arr){
        for(int i=1;i<arr.size();i++)
            if(arr.get(i-1)>=arr.get(i))
                return false;
        return true;
    }
    
    public ArrayList<Integer> inOrderBST(TreeNode root){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if(root==null) return arr;
        if(root.left!=null){
            arr.addAll(inOrderBST(root.left));
            if(root.left.val>=root.val) arr.add(root.left.val);
        }
        arr.add(root.val);
        if(root.right!=null){
            arr.addAll(inOrderBST(root.right));
            if(root.right.val<=root.val) arr.add(root.right.val);
        }
        
        return arr;
    }
}