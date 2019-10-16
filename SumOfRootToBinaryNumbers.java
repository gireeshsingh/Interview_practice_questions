/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SumOfRootToBinaryNumbers {
    public int sumRootToLeaf(TreeNode root) {
        if(root==null) return 0;
        List<String> list=helper(root,"");
        int ans=0;
        for(String str: list){
            int i=1, temp=0;
            for(String s: str.split("")){
                temp+=i*Integer.parseInt(s);
                i*=2;
            }
            ans+=temp;
        }
        return ans;
    }
    public List<String> helper(TreeNode root, String str){
        List<String> list=new ArrayList<String>();
        if(root==null) return list;
        if(root.left==null && root.right==null){
            list.add(root.val+str);
            return list;
        }
        list.addAll(helper(root.left,root.val+str));
        list.addAll(helper(root.right,root.val+str));
        return list;
    }
}