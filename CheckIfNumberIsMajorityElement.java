class Solution {
    public boolean isMajorityElement(int[] nums, int target) {
        int count=0;
        for(int i: nums) if(i==target) count++;
        return count>nums.length/2;
    }
}