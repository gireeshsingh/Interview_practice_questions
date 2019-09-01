class TrappingRainWater {
    public int trap(int[] height) {
        if(height==null || height.length==0)
            return 0;

        int maxWater=0;
        int i,len=height.length;
        int[] Lmax= new int[len];
        int[] Rmax= new int[len];
        Lmax[0]=height[0];
        Rmax[len-1]=height[len-1];
        
        for(i=1;i<len;i++){
            Lmax[i]=Math.max(Lmax[i-1], height[i]);
        }
        for(i=len-2;i>=0;i--){
            Rmax[i]=Math.max(Rmax[i+1], height[i]);
        }
        for(i=0;i<len;i++){
            maxWater+=Math.min(Rmax[i],Lmax[i])-height[i];
        }
        return maxWater;
    }
}