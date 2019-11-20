class LetterCasePermutation {
    public List<String> letterCasePermutation(String S) {
        List<String> ans=new ArrayList<String>();
        helper(ans, S, "", 0);
        return ans;
    }
    public void helper(List<String> ans, String S, String temp, int pos){
        if(pos==S.length()) {ans.add(temp); return;}
        if(Character.isLetter(S.charAt(pos))){
            helper(ans, S, temp+Character.toUpperCase(S.charAt(pos)), pos+1);
            helper(ans, S, temp+Character.toLowerCase(S.charAt(pos)), pos+1);
        }
        else helper(ans, S, temp+S.charAt(pos), pos+1);
    }
}