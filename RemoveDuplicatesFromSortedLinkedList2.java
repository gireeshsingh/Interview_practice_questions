/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class RemoveDuplicatesFromSortedLinkedList2 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead; // the tail of the wanted LinkedList
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            if ((prev==null||curr.val!=prev.val)&&(next==null||curr.val!=next.val)){
                tail.next = curr; // append to the wanted LinkedList
                tail = curr;
            }
            prev = curr;
            curr = curr.next;
        }
        tail.next = null;
        return dummyHead.next;
    }
}