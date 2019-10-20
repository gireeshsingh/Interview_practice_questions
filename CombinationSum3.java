class CombinationSum3 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        helper(1,k,n,res,new ArrayList<Integer>());
        return res;
    }
    public void helper(int i, int k, int n, List<List<Integer>> res, List<Integer> arr){
        if(k==0 && n==0){res.add(new ArrayList<>(arr));return;}
        if(k<0||n<0||i>9) return;
        arr.add(i);
        helper(i+1,k-1, n-i, res,arr);
        arr.remove(arr.size()-1);
        helper(i+1,k, n, res, arr);
    }
}