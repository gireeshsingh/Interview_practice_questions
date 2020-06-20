class Solution {
    public int[][] matrixBlockSum(int[][] mat, int K) {
        int r=mat.length, c=mat[0].length;
        int[][] sum = new int[r][c], ans = new int[r][c];
        sum[0][0]=mat[0][0];
        
        for(int i=1; i<r; i++) sum[i][0]=sum[i-1][0]+mat[i][0];
        for(int i=1; i<c; i++) sum[0][i]=sum[0][i-1]+mat[0][i];
        
        for(int i=1; i<r; i++) for(int j=1; j<c; j++) sum[i][j]=sum[i-1][j]+sum[i][j-1]+mat[i][j]-sum[i-1][j-1];
        System.out.println(Arrays.deepToString(sum));
        
        for(int i=0;i<r;i++){
            for(int j=0; j<c; j++){
                int sr=Math.max(0, i-K), sc=Math.max(0, j-K);
                int er=Math.min(r-1, i+K), ec=Math.min(c-1, j+K);
                
                if(sr==0 && sc==0) ans[i][j]=sum[er][ec];
                else if(sr==0) ans[i][j]=sum[er][ec]-sum[er][sc-1];
                else if(sc==0) ans[i][j]=sum[er][ec]-sum[sr-1][ec];
                else ans[i][j]=sum[er][ec]-sum[er][sc-1]-sum[sr-1][ec]+sum[sr-1][sc-1];
            }
        }
        
        return ans;
    }
}