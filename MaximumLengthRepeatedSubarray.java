class Solution {
    public int findLength(int[] A, int[] B) {
        int m=A.length, n=B.length, max=0;
        int[][] matrix=new int[n][m];
        for(int i=0;i<m;i++) if(A[i]==B[0]) matrix[0][i]=1;
        for(int j=0;j<n;j++) if(B[j]==A[0]) matrix[j][0]=1;
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(A[j]==B[i]) {
                    int temp=1+matrix[i-1][j-1];
                    max=Math.max(max, temp);
                    matrix[i][j]=temp;
                }
            }
        }
        return max;
    }
}