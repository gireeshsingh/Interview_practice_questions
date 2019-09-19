class ArrayPartitionSum {
    public int arrayPairSum(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        
        Arrays.sort(nums);
        int total=0,i=0;
        for(i=0;i<nums.length;i+=2){
            total+=Math.min(nums[i],nums[i+1]);
        }
        return total;
    }
}