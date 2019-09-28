class ClimbingStairs {
    public int climbStairs(int n) {
        if(n<2) return 1;
        int a=1, b=2, c=2;
        while(--n>1){
            c=a+b; a=b; b=c;
        }
        return c;
    }
}