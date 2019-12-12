/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class PallindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode tempNode = head;
        int len=0, i=0, temp=0, revtemp=0;
        if(head==null || head.next==null) return true;
        
        while(tempNode!=null){
            tempNode=tempNode.next;
            len++;
        }
        tempNode=head;
        
        while(i<len/2){
            temp=temp+tempNode.val*((int)Math.pow(10,i));
            tempNode=tempNode.next;
            i++;
        }
        
        if(len % 2  == 1){
            tempNode=tempNode.next;
        }
        
        while(tempNode!=null){
            revtemp=revtemp*10 + tempNode.val;
            tempNode=tempNode.next;
        }
    
        return revtemp == temp;
    }
}