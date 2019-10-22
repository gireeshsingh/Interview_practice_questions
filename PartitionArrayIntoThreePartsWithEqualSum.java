class PartitionArrayIntoThreePartsWithEqualSum {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum=0;
        for(int i: A) sum+=i;
        if(sum%3>0) return false;
        int count=0, total=0;
        for(int i: A){
            total+=i;
            if(total==sum/3) {total=0; count++;}
        }
        return count==3;
    }
}