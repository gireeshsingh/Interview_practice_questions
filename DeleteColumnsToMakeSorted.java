class DeleteColumnsToMakeSorted {
    public int minDeletionSize(String[] A) {
        int count=0,i=0,j=0;
        for(i=0;i<A[0].length();i++){
            for(j=0;j<A.length-1;j++){
                if((A[j].charAt(i)>A[j+1].charAt(i)))
                {
                    count++;
                    break;
                }   
            }
        }
        return count;
    }
}