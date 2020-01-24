class Solution {
    List<Integer> water;
    int maxIsland=Integer.MIN_VALUE;
    
    public int largestIsland(int[][] grid) {
        water = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap();
        List<HashSet<Integer>> listOfIslands = createIslands(grid);
        List<Boolean> visited;
        int max=Integer.MIN_VALUE;
        
        for(int i=0; i<water.size(); i=i+2){
            visited= new ArrayList<Boolean>();
            for(int k=0;k<listOfIslands.size(); k++) visited.add(false);
            int temp=0;
            int row=water.get(i);
            int col=water.get(i+1);
            int up=100000+ (row+1)*1000+(col);
            int down=100000+ (row-1)*1000+(col);
            int left=100000+ (row)*1000+(col-1);
            int right = 100000+ (row)*1000+(col+1);
            
            for(int j=0; j<listOfIslands.size(); j++){
                HashSet<Integer> island=listOfIslands.get(j);
                if(!visited.get(j)&&island.contains(up)) {
                    temp+=island.size();
                    visited.set(j, true);
                }
                if(!visited.get(j)&&island.contains(down)){
                    temp+=island.size();
                    visited.set(j, true);
                } 
                if(!visited.get(j)&&island.contains(left)){
                    temp+=island.size();
                    visited.set(j, true);
                }
                if(!visited.get(j)&&island.contains(right)){
                    temp+=island.size();
                    visited.set(j, true);
                }
            }
            max=Math.max(max, temp+1);
        }
        return max==Integer.MIN_VALUE?(maxIsland==grid.length*grid.length?maxIsland:maxIsland+1):max;
    }
    
    public List<HashSet<Integer>> createIslands(int[][] grid){
        ArrayList<HashSet<Integer>> listOfIslands = new ArrayList<HashSet<Integer>>();
        for(int i=0;i<grid.length;i++){
            for(int j=0; j<grid[i].length;j++){
                if(grid[i][j]==1){
                    HashSet<Integer> temp = dfsHelper(i,j, grid);
                    maxIsland=Math.max(maxIsland,temp.size());
                    listOfIslands.add(temp);
                }
                else if(grid[i][j]==0) {
                    water.add(i);
                    water.add(j);
                }
            }
        }
        return listOfIslands;
    }
    
    public HashSet<Integer> dfsHelper(int i, int j, int[][] grid){
        if(i<0||j<0||i>=grid.length||j>=grid[i].length ||grid[i][j]!=1) return new HashSet<Integer>();
        HashSet<Integer> res= new HashSet<Integer>();
        res.add(100000+i*1000+j); 
        grid[i][j]=777;
        res.addAll(dfsHelper(i,j+1, grid));
        res.addAll(dfsHelper(i+1,j, grid));
        res.addAll(dfsHelper(i,j-1, grid));
        res.addAll(dfsHelper(i-1,j, grid));
        return res;
    }
}