class RemoveDuplicatesFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        int i=1, len=1, flag=1;
        for(i=1;i<nums.length;i++) {
            if(nums[i-1]<nums[i]){
                flag=1;
                nums[len++]=nums[i];
                continue;
            }
            if(flag==1) nums[len++]=nums[i];
            flag++;
        }
        return len;
    }
}