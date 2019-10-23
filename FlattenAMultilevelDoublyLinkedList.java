/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node() {}

    public Node(int _val,Node _prev,Node _next,Node _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }
};
*/
class FlattenAMultilevelDoublyLinkedList {
    public Node flatten(Node head) {
        if(head==null) return null;
        if(head.next==null && head.child==null) return head;
        
        Node child=flatten(head.child);
        Node next=flatten(head.next);
        
        head.next=child;
        if(child!=null) child.prev=head;
        
        Node temp=head;
        while(temp.next!=null) temp=temp.next;
        temp.next=next;
        if(next!=null) next.prev=temp;
        
        head.child=null;
        return head;
    }
}