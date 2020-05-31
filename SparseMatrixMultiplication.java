class Solution {
    public int[][] multiply(int[][] A, int[][] B) {
        int[][] res = new int[A.length][B[0].length];
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                if(A[i][j]!=0){
                    for(int k=0;k<B[0].length;k++){
                        if(B[j][k]!=0){
                            res[i][k]+=B[j][k]*A[i][j];
                        }
                    }
                }
            }
        }
        return res;
    }
}