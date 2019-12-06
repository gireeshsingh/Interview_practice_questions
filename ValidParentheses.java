class ValidParentheses {
    public boolean isValid(String s) {
        if(s==null || s.length()==0) return true;
        Stack<String> parenth=new Stack<String>();
        for(String str: s.split("")){
            if(str.equals("(")||str.equals("[")||str.equals("{")) parenth.push(str);
            else if (parenth.isEmpty()||
                !((str.equals(")")&&parenth.pop().equals("("))||
                (str.equals("}")&&parenth.pop().equals("{"))||
                    (str.equals("]")&&parenth.pop().equals("[")))) return false;
        } 
        return parenth.isEmpty();
    }
}