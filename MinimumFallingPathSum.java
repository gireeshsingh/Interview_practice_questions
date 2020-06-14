class Solution {
    public int minFallingPathSum(int[][] A) {
        for(int i=1; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                int temp = Math.min(Math.min(A[i-1][j], j>0?A[i-1][j-1]:Integer.MAX_VALUE), j<A.length-1?A[i-1][j+1]:Integer.MAX_VALUE);
                A[i][j] += temp; 
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i: A[A.length-1]) ans=Math.min(ans, i);
        return ans;
    }
}