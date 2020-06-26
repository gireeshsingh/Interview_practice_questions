class Solution {
    public int countCornerRectangles(int[][] grid) {
        int ans=0;
        HashMap<Integer, Integer> map = new HashMap();
        for(int[] row: grid){
            for(int i=0;i<row.length; i++){
                if(row[i]==1){
                    for(int j=i+1; j<row.length; j++){
                        if(row[j]==1){
                            int index = 200*i+j;
                            int temp = map.getOrDefault(index, 0);
                            ans+=temp;
                            map.put(index, temp+1);
                        }
                    }
                }
            }
        }
        return ans;
    }
}