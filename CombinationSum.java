class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        helper(target,0, new ArrayList<Integer>(), res,candidates);
        return res;
    }
    public void helper(int target, int i, List<Integer> arr, List<List<Integer>> res, int[] candidates){
        if(target==0) {res.add(new ArrayList<Integer>(arr)); return;}
        if(target<0||i==candidates.length) return;
        arr.add(candidates[i]);
        helper(target-candidates[i], i, arr,res, candidates);
        arr.remove(arr.size()-1);
        helper( target, i+1, arr, res, candidates);
    }
}