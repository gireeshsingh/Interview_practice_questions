class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<nums.length; i++){
            if(Math.abs(nums[i])==nums.length) nums[0] = -Math.abs(nums[0]);
            else nums[Math.abs(nums[i])]=-Math.abs(nums[Math.abs(nums[i])]);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) {
                if(i==0) list.add(nums.length);
                else list.add(i);
            }
        }
        return list;
    }
}