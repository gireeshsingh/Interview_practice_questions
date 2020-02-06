class Solution {
    public String shortestPalindrome(String s) {
        int i=s.length();
        while(i>=0){
            if(pallind(s.substring(0,i))) return new StringBuilder(s.substring(i)).reverse().toString()+s;
            else i--;
        }
        return s;
    }
    
    public boolean pallind(String s){
        int len=s.length(),i=0, j=len-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return j>i?false:true;
    }
}