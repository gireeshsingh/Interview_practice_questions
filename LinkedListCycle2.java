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
public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        ListNode start=head;
        if(head==null || head.next==null) return null;
        ListNode temp= head.next.next;
        head=head.next;
        while(temp!=null && temp!=head){
            if(temp.next!=null) temp=temp.next.next;
            else temp=null;
            head=head.next;
        }
        if(temp!=null){
            head=start;
            while(temp!=start){
                temp=temp.next;
                start=start.next;
            }
        }
        return temp;
    }
}