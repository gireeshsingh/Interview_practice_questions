class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] s1count = new int[26];
        for(int i=0; i<s1.length(); i++) s1count[s1.charAt(i)-'a']++;
        
        for(int i=0; i<=s2.length()-s1.length(); i++){
            int[] s2count= new int[26];
            for(int j=0; j<s1.length(); j++) s2count[s2.charAt(i+j)-'a']++;
            if(match(s1count, s2count)) return true;
        }
        return false;
    }
    
    public boolean match(int[] s1count, int[] s2count){
        for(int i=0; i<26; i++) if(s1count[i]!=s2count[i]) return false;
        return true;
    }
}