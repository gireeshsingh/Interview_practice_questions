
class PopulatingNextRightPointers2 {
    ArrayList<Node> globalList=new ArrayList<Node>();
    
    public Node connect(Node root) {
        Node head=root;
        if(root!=null){

            Node tempRoot=root;
            globalList.clear();
            
            while(tempRoot!=null){
                if(tempRoot.left!=null)
                    globalList.add(tempRoot.left);
                if(tempRoot.right!=null)
                    globalList.add(tempRoot.right);
                tempRoot=tempRoot.next;
            }
            
            int i=0;
            System.out.println(globalList.toString());
            while(i<globalList.size()-1){
                globalList.get(i).next=globalList.get(i+1);
                i++;
            }

            connect(root.left);
            connect(root.right);
        }
        return head;
    }
    
}