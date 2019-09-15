class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        int i,j,temp;
        for(i=0;i<A.length;i++){
            j=0;
            while(j<A[i].length/2){
                A[i][j]+=A[i][A[i].length-j-1];
                A[i][A[i].length-j-1]=A[i][j]-A[i][A[i].length-j-1];
                A[i][j]-=A[i][A[i].length-j-1];
                A[i][j]=1^A[i][j];
                A[i][A[i].length-j-1]=1^A[i][A[i].length-j-1];
                j++;
            }
            if(A[i].length%2==1){
                A[i][j]=1^A[i][j];
            }
        }
        return A;
    }
}