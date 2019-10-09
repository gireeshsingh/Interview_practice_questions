/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) return false;
        ListNode fast=head.next, slow=head;
        while(fast!=null && fast!=slow){
            if(fast.next!=null) fast=fast.next.next;
            else fast=null;
            slow=slow.next;
        }
        return fast!=null;
    }
}