class CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        helper(new ArrayList<Integer>(), 0, candidates, res, target);
        return res;
    }
    public void helper(List<Integer> arr, int i, int[] candidates, List<List<Integer>> res, int target){
        if(target==0) {res.add(new ArrayList<>(arr)); return;}
        if(target<0) return;
        for(int j=i;j<candidates.length;j++){
            if(j==i || candidates[j]!=candidates[j-1]){
                arr.add(candidates[j]);
                helper(arr,j+1,candidates,res,target-candidates[j]);
                arr.remove(arr.size()-1);
            }
        }
    }
}