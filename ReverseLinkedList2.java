/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ReverseLinkedList2 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head.next==null || m==n) return head;
        int i=1;
        boolean flag=false;
        ListNode one=head,
                    two=head,
                    three=head,
                    mNode=head,
                    temp=head,
                    preNode=head;
        while(i<=m){
            if(i==(m-1)) preNode=temp;
            if(i==m) {
                mNode=temp;
                one=temp; two=one.next; three= two.next;
                while(i<n){
                    two.next=one;
                    one=two; two=three;
                    if(three!=null) three=three.next;
                    i++;
                }
            }
            temp=temp.next;
            i++;
        }
        preNode.next=one;
        mNode.next=two;
        if(m==1) return one;
        return head;
    }
}