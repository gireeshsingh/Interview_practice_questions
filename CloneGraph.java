/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};
*/
class CloneGraph {
    HashMap<Node,Node> visited=new HashMap<Node,Node>();
    public Node cloneGraph(Node node) {
        Node cur=new Node(node.val, new ArrayList<Node>());
        visited.put(node,cur);
        for(Node n: node.neighbors) cur.neighbors.add(visited.containsKey(n)?visited.get(n):cloneGraph(n));
        return cur;
    }
}