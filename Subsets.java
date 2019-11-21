class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        helper(result, nums, new ArrayList<Integer>(), 0);
        return result;
    }
    public void helper(List<List<Integer>> result, int[] nums, List<Integer> list, int pos){
        if(!result.contains(list)) result.add(new ArrayList<>(list));
        if(pos==nums.length) return;
        helper(result, nums, list, pos+1);
        list.add(nums[pos]);
        helper(result, nums, list, pos+1);
        list.remove(list.size()-1);
    }
}