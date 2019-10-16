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
class NAryLevelOrderTraversal {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> list = new ArrayList<>();
            while(size>0){
                Node node=q.poll();
                list.add(node.val);
                if(node.children!=null) q.addAll(node.children);
                size--;
            }
            result.add(list);
        }
        return result;
    }
}