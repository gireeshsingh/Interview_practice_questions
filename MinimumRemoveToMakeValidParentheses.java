class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack=new Stack();
        HashSet<Integer> remove = new HashSet<>();
        StringBuilder res=new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(c=='(') stack.push(i);
            else if(c==')') {
                if(stack.isEmpty()) remove.add(i);
                else stack.pop();
            }
        }
        while(!stack.isEmpty()) remove.add(stack.pop());
        for(int i=0; i<s.length(); i++){
            if(!remove.contains(i)) res.append(s.charAt(i));
        }
        return res.toString();
    }
}