class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        helper(res, new ArrayList<Integer>(), nums, 0);
        return res;
    }
    private void helper(List<List<Integer>> result,List<Integer> list,int[] nums,int pos){
        if(!result.contains(list)) result.add(new ArrayList<>(list));
        if(pos==nums.length) return;
        helper(result,list,nums,pos+1);
        list.add(nums[pos]);
        helper(result,list, nums, pos+1);
        list.remove(list.size()-1);
    }
}