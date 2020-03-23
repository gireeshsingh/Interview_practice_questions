class Solution {
    public int maxDistToClosest(int[] seats) {
        int oneStart=Integer.MAX_VALUE, oneEnd=Integer.MIN_VALUE;
        int ans=Integer.MIN_VALUE, count=0;
        
        int i=0;
        for(i=0; i<seats.length; i++){
            if(seats[i]==0) count++;
            else{
                oneStart=i-count-1;
                oneEnd=i;
                if(oneStart<0) ans=Math.max(ans, count);
                else ans=Math.max(ans,Math.min(count/2+1, count-count/2));
                count=0;
            }
        }
        if(seats[i-1]==0 && count>=ans){
            oneStart=i-count-1;
            oneEnd=i;
            if(oneStart<0||oneEnd>seats.length-1) ans=Math.max(ans, count);
            ans=Math.max(ans,Math.min(ans/2+1, ans-ans/2));
        }
        return ans;
    }
}