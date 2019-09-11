/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0 ) return null;
        if(lists.length==1) return lists[0];
        int i=0, count=0;
        for(i=0;i<lists.length;i++){
            if(lists[i]!=null){
                count++;
            }
        }
        if(count==0) return null;
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((x,y)->Integer.compare(x,y));
        for(i=0;i<lists.length;i++){
            ListNode ln = lists[i];
            while(ln!=null){
                pq.add(ln.val);
                ln=ln.next;
            }        
        }
        if(pq.peek()==null) return null;
        ListNode lnq=new ListNode(pq.poll()); ListNode head=lnq;
        while(pq.peek()!=null){
            ListNode lnq1=new ListNode(pq.poll());
            lnq.next=lnq1;
            lnq=lnq1;
        }
        return head;
    }
}