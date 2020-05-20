class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        ListNode mid=helper(head);
        
        TreeNode root = new TreeNode(mid.val);
        if(head==mid) return root;
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(mid.next);
        
        return root;
    }
    public ListNode helper(ListNode head){
        ListNode slow=head, fast=head, prev=null;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        if(prev !=null ) prev.next=null;
        
        return slow;
    }
}