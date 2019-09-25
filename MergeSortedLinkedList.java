/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MergeSortedLinkedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode prev;
        if(l1.val < l2.val){
            prev=new ListNode(l1.val);
            l1=l1.next;
        }
        else{
            prev=new ListNode(l2.val);
            l2=l2.next;
        }
        ListNode head = prev;
        
        while(l1!=null && l2!=null){
            if(l1.val < l2.val){
                ListNode cur = new ListNode(l1.val);
                l1=l1.next;
                prev.next=cur;
                prev=cur;
            }
            else{
                ListNode cur=new ListNode(l2.val);
                l2=l2.next;
                prev.next=cur;
                prev=cur;
            }
        }
        
        while(l1!=null){
            ListNode cur = new ListNode(l1.val);
            l1=l1.next;
            prev.next=cur;
            prev=cur;
        }
        while(l2!=null){
            ListNode cur = new ListNode(l2.val);
            l2=l2.next;
            prev.next=cur;
            prev=cur;
        }
        prev.next=null;
        return head;
    }
}