class RemoveOuterMostParentheses {
    public String removeOuterParentheses(String S) {
        int count=0;
        StringBuffer sb = new StringBuffer(S);
        int i=0;
        while(i<sb.length()){   
            if(sb.substring(i,i+1).equals("(")){
                if(++count==1){ 
                    sb.delete(i,i+1);
                }
                else
                    i++;
            }
            else {
                if(--count==0){
                    sb.delete(i,i+1);
                }
                else
                    i++;
            }
        }
        return sb.toString();
    }
}