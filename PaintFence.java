class Solution {
    public int numWays(int n, int k) {
        if(n==0) return 0;
        if(n==1) return k;
        if(n==2) return k*k;
        
        int[] ans = new int[n+1];
        ans[0]=0;
        ans[1]=k;
        ans[2]=k*k;
        for(int i=3; i<n+1; i++)
            ans[i]=ans[i-1]*(k-1)+ans[i-2]*(k-1);
        
        return ans[n];
    }
}