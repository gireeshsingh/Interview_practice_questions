class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, new ArrayList<Integer>(), k, 1, n);
        return res;
    }
    public void helper(List<List<Integer>> res, List<Integer> arr, int k, int i, int n){
        if(k==0) {res.add(new ArrayList<>(arr)); return;}
        if(k<0||i>n) return;
        arr.add(i);
        helper(res,arr,k-1,i+1,n);
        arr.remove(arr.size()-1);
        helper(res,arr,k,i+1,n);
    }
}