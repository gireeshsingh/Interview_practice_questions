class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums.length*nums[0].length!=r*c) return nums;
        int[][] res=new int[r][c];
        int oldi=0,oldj=0;
        for(int i=0; i<r;i++){
            for(int j=0;j<c;j++){
                res[i][j]=nums[oldi][oldj];
                oldj++;
                oldi=oldi+oldj/nums[0].length;
                oldj=oldj%nums[0].length;
            }
        }
        return res;
    }
}