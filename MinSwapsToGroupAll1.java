class Solution {
    public int minSwaps(int[] data) {
        int count=0, max=0;
        for(int i: data) if(i==1) count++;
        for(int i=0; i<count; i++) if(data[i]==1) max++;
        int res=max;
        for(int i=count; i<data.length; i++){
            if(data[i-count]==1) max--;
            if(data[i]==1) max++;
            res=Math.max(res,max);
        }
        return count-res;
    }
}