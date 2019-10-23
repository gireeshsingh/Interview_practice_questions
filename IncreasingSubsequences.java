class IncreasingSubsequences {
    HashSet<List<Integer>> result=new HashSet<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++){
            arr.add(nums[i]);
            helper(nums, i+1, arr);
            arr.remove(arr.size()-1);
        }
        return new ArrayList<>(result);
    }
    public void helper(int[] nums, int pos, List<Integer> arr){
        if(arr.size()>1) result.add(new ArrayList<Integer>(arr));
        if(pos==nums.length) return;
        for(int i=pos; i<nums.length; i++){
            if(arr.get(arr.size()-1)<=nums[i]){
                arr.add(nums[i]);
                helper(nums, i+1, arr);
                arr.remove(arr.size()-1);
            }
        }
    }
}