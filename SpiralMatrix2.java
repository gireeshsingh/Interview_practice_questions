class SpiralMatrix2 {
    public int[][] generateMatrix(int n) {
        int[][] res=new int[n][n];
        if(n==0) return res;
        int i=0,j=0,rowmax=n, colmax=n, cur=1, colmin=0, rowmin=0, direction=0;
        int[][] incr={{0,1},{1,0},{0,-1},{-1,0}};
        while(cur<=Math.pow(n,2)){
            res[i][j]=cur;
            i=i+incr[direction][0];
            j=j+incr[direction][1];
            if(i<rowmin || i>=rowmax || j<colmin || j>=colmax) {
                if(incr[direction]==incr[0]) {rowmin++; i=rowmin; j=colmax-1;}
                else if(incr[direction]==incr[1]) {colmax--; i=rowmax-1; j=colmax-1;}
                else if(incr[direction]==incr[2]) {rowmax--; i=rowmax-1; j=colmin;}
                else if(incr[direction]==incr[3]) {colmin++; i=rowmin; j=colmin;}
                direction=(direction+1)%4;
            }
            cur++;
        }
        return res;
    }
}