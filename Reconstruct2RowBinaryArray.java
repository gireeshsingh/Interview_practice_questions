class Solution {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        int sum=0;
        List<List<Integer>> res = new ArrayList();
        int[] up = new int[colsum.length], lo=new int[colsum.length];

        for(int i: colsum) sum+=i;
        if(sum!=lower+upper) return res;
        
        for(int i=0; i<colsum.length; i++){
            if(colsum[i]==2) {
                up[i]=1;
                lo[i]=1;
                --upper;
                --lower;
            }
        }
        
        for(int i=0;i<colsum.length; i++){
            if(colsum[i]==1){
                if(upper>0){
                    up[i]=1;
                    --upper;
                }
                else if(lower>0){
                    lo[i]=1;
                    --lower;
                }
                else return res;
            }
        }
        
        if(upper!=0 || lower!=0) return res;
        res.add(Arrays.stream(up).boxed().collect(Collectors.toList()));
        res.add(Arrays.stream(lo).boxed().collect(Collectors.toList()));
        return res;
    }
}