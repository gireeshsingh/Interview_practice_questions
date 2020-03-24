class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<Integer>(), prev;
        res.add(1);
        for(int i=0; i<rowIndex; i++){
            prev=new ArrayList<>(res);
            res.clear();
            res.add(1);
            for(int j=0;j<i;j++){
                res.add(prev.get(j)+prev.get(j+1));
            }
            res.add(1);
        }
        return res;
    }
}