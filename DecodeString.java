class Solution {
    public String decodeString(String s) {
        int i=0;
        Stack<String> stack = new Stack<String>();
        while(i<s.length()){
            char ch = s.charAt(i);
            String temp=""+ch;
            if(Character.isLetter(ch)) while(++i<s.length() && Character.isLetter(s.charAt(i))) temp=temp+s.charAt(i);
            else if(Character.isDigit(ch)) while(++i<s.length() && Character.isDigit(s.charAt(i))) temp=temp+s.charAt(i);
            else if(ch==']'){
            	temp="";
                while(!stack.isEmpty() && !stack.peek().equals("[")){
                    String block=stack.pop();
                    if(Character.isLetter(block.charAt(0))) temp=block+temp;
                }
                stack.pop();
                int mult=Integer.parseInt(stack.pop());
                String nowTemp="";
                for(int j=0; j<mult; j++) nowTemp+=temp;
                temp=nowTemp;
                i++;
            }
            else i++;
            stack.push(temp);
        }
        String res="";
        while(!stack.isEmpty()) res=stack.pop()+res;
        return res;
    }
}