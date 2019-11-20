class PathWithMaxGold {
    public int getMaximumGold(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++)
                max=Math.max(max,helper(i,j, grid, 0));
        return max;
    }
    public int helper(int row, int col, int[][] grid, int max){
        if(row<0||col<0||row>=grid.length||col>=grid[0].length||grid[row][col]==0) return max;
        int temp=grid[row][col];
        max+=temp;
        int tempmax=max;
        grid[row][col]=0;
        max=Math.max(max,helper(row+1, col, grid, tempmax));
        max=Math.max(max,helper(row, col+1, grid, tempmax));
        max=Math.max(max,helper(row-1, col, grid, tempmax));
        max=Math.max(max,helper(row, col-1, grid, tempmax));
        grid[row][col]=temp;
        return max;
    }
}