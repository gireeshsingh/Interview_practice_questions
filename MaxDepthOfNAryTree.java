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
class MaxDepthOfNAryTree {
    public int maxDepth(Node root) {
        if(root==null) return 0;
        return helper(root,1);
    }
    public int helper(Node root, int depth){
        if(root.children.isEmpty()) return depth;
        int max=depth;
        for(Node node: root.children) max=Math.max(max, helper(node, depth+1));
        return max;
    }
}