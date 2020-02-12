class Solution {
    public int numberOfBoomerangs(int[][] points) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int ans=0;
        
        for(int i=0; i<points.length; i++){
            for(int j=0; j<points.length; j++)
            {
                if(i==j) continue;
                int x=points[i][0]-points[j][0];
                int y=points[i][1]-points[j][1];
                int diff=x*x+y*y;
                map.put(diff, map.getOrDefault(diff,0)+1);
            }
            for(int k: new ArrayList<Integer>(map.values())){
                ans+=(k)*(k-1);
            }
            map.clear();
        }
        return ans;
    }
}