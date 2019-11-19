/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode rabbit=head, tortoise=head;
        while(rabbit!=null && rabbit.next!=null){
            rabbit=rabbit.next.next;
            tortoise=tortoise.next;
        }
        return tortoise;
    }
}