/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class subTreeOfAnotherTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        
        while(s != null){
            if(s.val == t.val && checkTree(s,t) ){
                return true;
            } else{
               return isSubtree(s.left,t) || isSubtree(s.right,t) ;
            }
        }
        return false;
    }
    
    public boolean checkTree(TreeNode S1, TreeNode S2){
        if(S1 == null && S2 == null)
            return true;
        if(S1 == null || S2 == null) return false;
        if(S1.val == S2.val && checkTree(S1.left, S2.left) && checkTree(S1.right, S2.right) )
            return true;
        return false;
    }
}