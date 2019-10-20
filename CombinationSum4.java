class CombinationSum4 {
    int[] dp;
    public int combinationSum4(int[] nums, int target) {
        dp=new int[target+1];
        Arrays.fill(dp, -1);
        dp[0]=1;
        return helper(nums, target);
    }
    public int helper(int[] nums, int target){
        if(target<0) return 0;
        if(dp[target]!=-1) return dp[target];
        int res=0;
        for(int i: nums) if(target-i>=0) res+=helper(nums, target-i);
        dp[target]=res;
        return res;
    }
}