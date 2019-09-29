class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        return helper("", 0,0,n);
    }
    public List<String> helper(String str, int L, int R, int n){
        if(L==R && R==n) return new ArrayList<String>(Arrays.asList(str));
        if(L<R || L>n || R>n) return new ArrayList<String>();
        ArrayList<String> op = new ArrayList<String>(helper(str+"(", L+1, R, n));
        op.addAll(helper(str+")", L,R+1,n));
        return op;
    }
}