class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int res=Integer.MIN_VALUE, count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                count++;
            }
            else {
                res=Math.max(res,count);
                count=1;
            }
        }
        res=Math.max(res, count);
        return res;
    }
}