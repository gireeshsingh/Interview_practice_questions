/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1=l1,h2=l2; int len1=0,len2=0;
        while(h1!=null){
            len1++; h1=h1.next;
        }
        while(h2!=null){
            len2++;h2=h2.next;
        }
        if(len1<len2){
            ListNode tempNode=l1;l1=l2;l2=tempNode;
            int tempLen=len1;len1=len2;len2=tempLen;
        }
        if(len2<len1){
            h2=l2;
            while(h2.next!=null) h2=h2.next;
            while(len2<len1){
                ListNode zeroNode=new ListNode(0);
                zeroNode.next=null;
                h2.next=zeroNode;
                h2=h2.next;
                len2++;
            }
        }
        h1=l1;h2=l2; int carry=0; ListNode prev=l1;
        while(h1!=null){
            int tempVal=h1.val+h2.val+carry;
            h1.val=tempVal; carry=0;
            if(tempVal>9){
                h1.val=tempVal%10;
                carry=tempVal/10;
            }
            prev=h1; h1=h1.next; h2=h2.next;
        }
        if(carry>0){
            ListNode carryNode=new ListNode(carry);
            carryNode.next=null;
            prev.next=carryNode;
        }
        return l1;
    }
}