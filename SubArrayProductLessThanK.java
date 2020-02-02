class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans=0, left=0, prod=1;
        for(int i=0;i<nums.length;i++){
            prod*=nums[i];
            while(prod>=k && left<=i) prod/=nums[left++];
            ans+=i-left+1;
        }
        return ans;
    }
}