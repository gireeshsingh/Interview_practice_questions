class Solution {
    public int findMinDifference(List<String> timePoints) {
        boolean[] temp=new boolean[1440];
        for(String str: timePoints){
            String[] time=str.split(":");
            int diff=Integer.parseInt(time[0])*60+Integer.parseInt(time[1]);
            if(temp[diff]==true) return 0;
            temp[diff]=true;
        }
        int last=-1, first=-1, min=Integer.MAX_VALUE;
        for(int i=0;i<1440;i++){
            if(temp[i]){
                if(last==-1){
                    first=i;
                    last=i;
                    continue;
                }
                min=Math.min(min, i-last);
                last=i;
            }
        }
        min=Math.min(min, 1440-last+first);
        return min;
    }
}