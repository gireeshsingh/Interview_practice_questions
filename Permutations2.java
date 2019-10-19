class Permutations2 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        int[] temphm=new int[nums.length];
        List<List<Integer>> res = new ArrayList<>();
        helper(nums, temphm, res, new ArrayList<Integer>());
        return res;
    }
    public boolean valid(List<List<Integer>> res, List<Integer> arr){
        for(List<Integer> l: res) if(l.equals(arr)) return false;
        return true;
    }
    public void helper(int[] nums, int[] temphm, List<List<Integer>> res, List<Integer> arr){
        if(arr.size()==nums.length) {
            if(valid(res,arr))
                res.add(new ArrayList<>(arr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(temphm[i]==0){
                temphm[i]=1;
                arr.add(nums[i]);
                helper(nums, temphm, res, arr);
                temphm[i]=0;
                arr.remove(arr.size()-1);
            }
        }
    }
}