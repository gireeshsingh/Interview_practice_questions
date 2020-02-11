class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left[] = new int[nums.length], right[] = new int[nums.length];
        int temp=1, j=0;
        for(int i:nums){ left[j++]=temp; temp*=i; }
        temp=1;
        for(int i=nums.length-1; i>=0; i--){ right[i]=temp; temp*=nums[i]; }
        for(int i=0; i<nums.length;i++) {nums[i]=left[i]*right[i];}
        return nums;
    }
}