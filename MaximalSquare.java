class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        if(matrix ==null || matrix.length==0 || matrix[0].length==0) return 0;
        int[][] temp=new int[matrix.length][matrix[0].length];
        int max=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='0') temp[i][j]=0;
                else temp[i][j]=1;
            }
        }
        for(int i=1;i<temp.length;i++){
            for(int j=1;j<temp[0].length;j++){
                if(temp[i][j]==1){
                    temp[i][j]=1+Math.min(Math.min(temp[i-1][j-1],temp[i-1][j]),temp[i][j-1]);
                    max=Math.max(temp[i][j], max);
                }
            }
        }
        if(max==0){
            for(int i=0;i<temp.length;i++)
                for(int j=0;j<temp[0].length;j++)
                    if(temp[i][j]==1) return 1;
        }
        return max*max;
    }
}