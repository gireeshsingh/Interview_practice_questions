/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class SplitLinkedListInParts {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode head=root, temp=root;int n=0,i=0,j=0, extra=0, count=0;
        while(head!=null){head=head.next;n++;}
        ListNode[] res=new ListNode[k];
        head=root;
        if(n/k<1){
            while(i<n){
                temp=head; head=head.next; temp.next=null;
                res[i++]=temp;
            }
        }
        else{
            count=n/k;extra=n%k;
            while(i<n && temp!=null){
                j=0;
                ListNode temphead=temp;
                while(j++<count-1 ){temp=temp.next;}
                if(extra-->0){temp=temp.next;}
                head=temp.next;
                temp.next=null;
                temp=head;
                res[i++]=temphead;
            }
        }
        return res;
    }
}