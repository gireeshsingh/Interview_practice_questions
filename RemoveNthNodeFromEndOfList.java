/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;
        if(head.next==null) return null;
        ListNode forward=head, temp=head, back=head;
        int i=1;
        while(i<=n) {temp=forward; forward=forward.next; i++;}
        if(forward==null){ back=back.next; return back; }
        while(forward.next!=null){
            back=back.next;
            forward=forward.next;
        }
        back.next=back.next.next;
        return head;
    }
}