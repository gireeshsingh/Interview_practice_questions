class Solution {
    public boolean isMonotonic(int[] A) {
        int store = 0;
        int diff;
        for(int i=0; i<A.length-1;i++){
            diff=Integer.compare(A[i],A[i+1]);
            if(diff!=0){
                if(diff!=store && store!=0) return false;
                store=diff;
            }
        }
        return true;
    }
}