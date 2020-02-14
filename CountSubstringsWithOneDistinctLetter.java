class Solution {
    public int countLetters(String S) {
        char prev=S.charAt(0);
        int ans=0, count=1;
        for(int i=1;i<S.length(); i++){
            if(prev!=S.charAt(i)){
                ans+=count*(count+1)/2;
                count=1;
            }
            else count++;
            prev=S.charAt(i);
        }
        return ans+count*(count+1)/2;
    }
}