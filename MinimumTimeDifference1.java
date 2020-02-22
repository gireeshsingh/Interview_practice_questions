class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[] temp=new int[timePoints.size()];
        int i=0;
        for(String str: timePoints){
            String[] time=str.split(":");
            temp[i++]=Integer.parseInt(time[0])*60+Integer.parseInt(time[1]);
        }
        Arrays.sort(temp);
        int min=1440-temp[i-1]+temp[0];
        for(i=1; i<temp.length;i++) min=Math.min(min, temp[i]- temp[i-1]);
        return min;
    }
}