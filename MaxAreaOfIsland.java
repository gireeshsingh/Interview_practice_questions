class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int i,j,max=0;
        for(i=0;i<grid.length;i++){
            for(j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    max=Math.max(max,dfs(grid,i,j));
                }
            }
        }
        return max;
    }
    
    public int dfs(int[][] grid, int row, int col){
        if(row<0 || col<0 || row>grid.length-1 || col>grid[0].length-1 || grid[row][col]==0){
            return 0;
        }
        grid[row][col]=0;
        int count=1;
        count+=dfs(grid,row+1,col);
        count+=dfs(grid,row-1,col);
        count+=dfs(grid,row,col+1);
        count+=dfs(grid,row,col-1);
        return count;
    }
}