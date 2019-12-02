/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return head;
        ListNode temphead=head, last=head;
        int i=0,n=1;
        while(temphead.next!=null) {temphead=temphead.next; n++;}
        temphead.next=head;//making the list circular
        k=n-k%n;
        temphead=head;
        while(i<k-1) {temphead=temphead.next;i++;}
        last=temphead.next;
        temphead.next=null;
        return last;
    }
}