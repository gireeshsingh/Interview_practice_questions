class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] A) {
        //array with zero or no length
        if(A==null || A.length==0) return 0;
        
        int i=0, index=0;
        //find min wrt each element
        for(i=1;i<A.length;i++){
            if(A[i-1]>=A[i]){
                index=i-1;
                break;
            }
        }
        if(index==0)
            return 0;
        for(i=index+1;i<A.length;i++){
            if(A[i-1]<=A[i]){
                break;
            }
        }
        if(i!=A.length)
            return 0;
        else
            return index;
    }
}