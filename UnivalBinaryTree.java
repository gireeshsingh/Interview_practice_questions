class UnivalBinaryTree {
    public boolean isUnivalTree(TreeNode root) {
        
        if(root==null || (root.left==null && root.right== null))
            return true;
        if(root.left!=null && root.left.val!=root.val){
            return false;
        }
        if(root.right!=null && root.right.val!=root.val){
            return false;
        }
        return isUnivalTree(root.right) && isUnivalTree(root.left);
    }

}