class Solution {
    public boolean isReflected(int[][] points) {
        HashSet<Double> set=new HashSet<Double>();
        int xleft=Integer.MAX_VALUE, xright=Integer.MIN_VALUE, ydown=Integer.MAX_VALUE, yup=Integer.MIN_VALUE;
        for(int[] point: points){
            xleft=Math.min(xleft, point[0]);
            xright=Math.max(xright,point[0]);
            set.add((double) point[0]*100000+point[1]);
        }
        double xmid=(xleft+xright)/(double)2;
        for(int[] point: points){
            double id=point[0]*100000+point[1];
            if(!set.contains(id)) continue;
            if(point[0]==xmid) set.remove(id);
            else if(point[0]<xmid){
                double diff=xmid-point[0];
                double remid=(point[0]+diff*2)*100000+point[1];
                if(set.contains(remid)) {
                    set.remove(remid);
                    set.remove(id);
                }
                else return false;
            }
            else{
                double diff=point[0]-xmid;
                double remid=(point[0]-diff*2)*100000+point[1];
                if(set.contains(remid)){
                    set.remove(remid);
                    set.remove(id);
                }   
                else return false;
            }
        }
        return set.size()==0;
    }
}