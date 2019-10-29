class IsSubsequence {
    HashMap<String, Boolean> hm=new HashMap<String, Boolean>();
    public boolean isSubsequence(String t, String s) {
        if(s.length()>=t.length())return helper(s, t, 0, 0);
        return false;
    }
    public boolean helper(String S, String T, int iS, int iT){
        if(iT==T.length()) return true;
        if(iS==S.length()) return false;
        boolean ans=false;
        if(S.charAt(iS)==T.charAt(iT)) ans=helper(S,T,iS+1,iT+1);
        return ans||helper(S,T,iS+1,iT);
    }
}