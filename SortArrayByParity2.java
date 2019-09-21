class SortArrayByParity2 {
    public int[] sortArrayByParityII(int[] A) {
        if(A==null || A.length==0) return null;
        int i=0,eveni=0,oddi=1;
        int[] result=new int[A.length];
        for(i=0; i<A.length;i++){
            if(A[i]%2==0){
                result[eveni]=A[i];
                eveni+=2;
            }
            else{
                result[oddi]=A[i];
                oddi+=2;
            }
        }
        return result;
    }
}