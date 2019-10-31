class Largest1BorderedSquare {
    public int largest1BorderedSquare(int[][] grid) {
        if(grid==null || grid.length==0) return 0;
        int[][] hor=new int[grid.length][grid[0].length];
        int[][] ver=new int[grid.length][grid[0].length];
        computeHor(grid,hor);
        computeVer(grid,ver);
        int max=0;
        for(int i=grid.length-1;i>=0;i--)for(int j=grid[0].length-1;j>=0;j--)
            if(hor[i][j]>max){
                int temp=hor[i][j];
                while(temp>max){
                    int lmn=check(ver, hor, temp--, i, j,max);
                    if(lmn!=Integer.MIN_VALUE) {max=lmn; break;}
                }
            }
        if(max==0){
            for(int i=0;i<grid.length;i++)for(int j=0;j<grid[0].length;j++)if(grid[i][j]==1) return 1;return 0;
        }
        return max*max;
    }
    public int check(int[][] ver, int[][] hor, int temp, int i, int j, int max){
        if(i-(temp-1)>=0 && j-(temp-1)>=0 && ver[i][j]>=temp && ver[i][j-(temp-1)]>=temp && hor[i-(temp-1)][j]>=temp) return Math.max(temp,max);
        return Integer.MIN_VALUE;
    }
    public void computeHor(int[][] grid, int[][] hor){
        for(int i=0;i<grid.length;i++){hor[i][0]=grid[i][0];
            for(int j=1;j<grid[0].length;j++) if(grid[i][j]==1) hor[i][j]=hor[i][j-1]+1;
        }
    }
    public void computeVer(int[][] grid, int[][] ver){
        for(int i=0;i<grid[0].length;i++){ver[0][i]=grid[0][i];
            for(int j=1;j<grid.length;j++) if(grid[j][i]==1) ver[j][i]=ver[j-1][i]+1;
        }
    }
}