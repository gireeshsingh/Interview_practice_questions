class SplitStringInBalancedStrings {
    public int balancedStringSplit(String s) {
        int ans=0,temp=0;
        for(char c: s.toCharArray()){
            if(c=='R') temp++;
            else temp--;
            if(temp==0) ans++;
        }
        return ans;
    }
}