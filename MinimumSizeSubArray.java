class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int min=Integer.MAX_VALUE, sum=0, left=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=s){
                min=Math.min(min, i-left+1);
                sum-=nums[left++];
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}