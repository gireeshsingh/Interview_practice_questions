class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        if(abbr.length()>word.length()) return false;
        int j=0, i=0, prev=0;
        while(i<word.length()&&j<abbr.length()){
            if(Character.isLetter(abbr.charAt(j))){
                i+=prev;
                prev=0;
                if(i>=word.length() || word.charAt(i++)!=abbr.charAt(j++)) return false;
            }
            else{
                prev=(prev*10)+Character.getNumericValue(abbr.charAt(j++));
                if(prev==0) return false;
                if(j==abbr.length()) i+=prev;
            }
        }
        if(j==abbr.length() && i==word.length()) return true;
        return false;
    }
}