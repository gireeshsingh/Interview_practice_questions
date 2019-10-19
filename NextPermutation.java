class NextPermutation {
    public void nextPermutation(int[] nums) {
        if(nums==null||nums.length<2) return;
        if(nums.length==2){int temp=nums[0]; nums[0]=nums[1]; nums[1]=temp; return;}
        int i=0;
        for(i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                Arrays.sort(nums,i+1,nums.length);
                int tempIndex1=i,tempIndex2=i;
                int temp=nums[tempIndex1];
                int min=Integer.MAX_VALUE;
                while(++i<nums.length){
                    if(nums[i]>temp) {
                        if(min>nums[i]){
                            min=nums[i];
                            tempIndex2=i;
                        }
                    }
                }
                nums[tempIndex1]=nums[tempIndex2];
                nums[tempIndex2]=temp;
                break;
            }
        }
        if(i==-1) Arrays.sort(nums);
    }
}