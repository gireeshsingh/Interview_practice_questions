/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;
        if(head.next==null && head.val==val) return null;
        while(head!=null && head.val==val) head=head.next;
        ListNode temp=head, prev=head;
        while(temp!=null){
            if(temp.val==val){
                prev.next=temp.next; temp=temp.next;
            }
            else{
                prev=temp; temp=temp.next;
            }
        }
        return head;
    }
}