class Solution {
    public boolean validMountainArray(int[] A) {
        int flag=0;
        if(A.length<3 || A[1]<=A[0]) return false;
        for(int i=2; i<A.length; i++){
            if(flag==0){
                if(A[i-1]==A[i]) return false;
                else if(A[i-1]>A[i]) flag=1;
            }
            else if(A[i-1]<=A[i]) return false;
        }
        return flag==1;
    }
}