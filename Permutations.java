class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        helper(res, new  ArrayList<Integer>(), nums);
        return res;
    }
    public void helper(List<List<Integer>> res, List<Integer> arr, int[] nums){
        if(arr.size()==nums.length) {res.add(new ArrayList<>(arr)); return;}
        if(arr.size()>nums.length) return;
        for(int i: nums){
            if(!arr.contains(i)) {
                arr.add(i);
                helper(res,arr,nums);
                arr.remove(arr.size()-1);
            }
        }
    }
}