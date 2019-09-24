class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        
        if(nums==null || nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int max=Integer.MIN_VALUE, temp=0;
        for(int i=0;i<nums.length;i++){
            temp=temp+nums[i];
            if(temp>max) max=temp;
            if(temp<0) temp=0;
        }
        return max;
    }
}