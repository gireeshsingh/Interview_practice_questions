class Solution {
    public int minAreaRect(int[][] points) {
        
        int min=Integer.MAX_VALUE;
        HashSet<Integer> set= new HashSet();
        
        for(int[] point: points) set.add(point[0]*100000+point[1]);
        
        for(int i=0;i<points.length; i++){
            for(int j=i+1; j<points.length; j++){
                if(points[i][0]!=points[j][0]&&points[i][0]!=points[j][1]&&points[i][1]!=points[j][0]&&points[i][1]!=points[j][1])  {
                    int area=Math.abs(points[i][0]-points[j][0])*Math.abs(points[i][1]-points[j][1]);
                    if(area<min && set.contains(points[i][0]*100000+points[j][1])&&set.contains(points[j][0]*100000+points[i][1]))
                        min=area;
                }
            }
        }
        
        return min==Integer.MAX_VALUE?0: min;
    }
}