/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class NextPointerInBinaryTree {
    public Node connect(Node root) {
        Node head=root;
        if(root!=null && root.left!=null){
            root.left.next=root.right;
            if(root.next!=null)
                root.right.next=root.next.left;
            connect(root.left);
            connect(root.right);
        }
        root=head;
        return head;
    }
}