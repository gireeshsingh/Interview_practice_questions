class Solution {
    public boolean divisorGame(int N) {
        boolean[] dp = new boolean[N+1];
        for(int i=1; i<N+1; i++){
            for(int j=1; j<i; j++){
                if(i%j==0 && !dp[i-j]){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[N];
    }
}