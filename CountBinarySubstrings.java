class Solution {
    public int countBinarySubstrings(String s) {
        int ans=0, prev=-1, cZero=0, cOne=0;
        for(char c: s.toCharArray()){
            int i=c-'0';
            if(prev!=i){
                ans+=Math.min(cZero,cOne);
                if(i==1) cOne=1;
                else cZero=1;
            }
            else if(i==1) cOne++;
            else cZero++;
            prev=i;
        }
        ans+=Math.min(cZero, cOne);
        return ans;
    }
}