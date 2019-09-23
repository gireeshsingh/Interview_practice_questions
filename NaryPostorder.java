/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class NaryPostorder {
    public List<Integer> postorder(Node root) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if(root==null) return arr;
        for(Node node: root.children)
            arr.addAll(postorder(node));
        arr.add(root.val);
        return arr;
    }
}