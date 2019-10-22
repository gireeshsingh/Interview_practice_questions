/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
*/
class CopyLinkedListWithRandomPointer {
    HashMap<Node, Node> created=new HashMap<Node, Node>();
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Node cur = new Node(head.val, null, null);
        created.put(head,cur);
        cur.next=created.containsKey(head.next)?created.get(head.next):copyRandomList(head.next);
        cur.random=created.containsKey(head.random)?created.get(head.random):copyRandomList(head.random);
        return cur;
    }
}