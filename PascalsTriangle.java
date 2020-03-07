class Solution { 
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(numRows==0) return res;
        res.add(new ArrayList<Integer>());
        res.get(0).add(1);
        for(int row=1; row<numRows; row++){
            List<Integer> list = new ArrayList();
            List<Integer> prev = res.get(row-1);
            list.add(1);
            for(int j=1; j<row; j++)
                list.add(prev.get(j-1)+prev.get(j));
            list.add(1);
            res.add(list);
        }
        return res;
    }
}