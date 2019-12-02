class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int len=1,i=0;
        for(i=1;i<nums.length;i++) if(nums[i-1]<nums[i]){nums[len++]=nums[i];}
        return len;
    }
}