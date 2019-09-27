/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class AddTwoNumbers2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1=l1, h2=l2;
        int len1=0, len2=0;
        while(l1!=null){
            l1=l1.next; len1++;
        }
        while(l2!=null){
            l2=l2.next; len2++;
        }
        if(len1<len2){
            ListNode temp=h1; h1=h2; h2=temp;
            int tempLen=len1; len1=len2; len2=tempLen;
        }
        if(len2<len1){
            ListNode temp=new ListNode(0);
            ListNode newh2=temp;
            len2++;
            while(len2<len1){
                ListNode newtemp=new ListNode(0);
                temp.next=newtemp;
                temp=newtemp;
                len2++;
            }
            temp.next=h2;
            h2=newh2;
        }
        h1=reverse(h1); h2=reverse(h2);
        int carry=0;
        ListNode temp=h1, result=h1;
        while(h1!=null){
            int tempVal=h1.val+h2.val+carry;
            carry=0; h1.val=tempVal;
            if(tempVal>9){
                carry=tempVal/10;
                h1.val=tempVal%10;
            }
            temp=h1;
            h1=h1.next;
            h2=h2.next;
        }
        if(carry>0){
            ListNode newCarry = new ListNode(carry);
            newCarry.next=null;
            temp.next=newCarry;
        }
        return reverse(result);
    }
    
    public ListNode reverse(ListNode l1){
        if(l1==null || l1.next==null) return l1;
        ListNode one=null, two=l1, three=two.next;
        while(two!=null){
            two.next=one; one=two; two=three;
            if(three!=null) three=three.next;
        }
        return one;
    }

}