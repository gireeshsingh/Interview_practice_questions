class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        if(n<1) return false;
        while(n!=0){
            if(n%2==0) n=n/2;
            else if(n==1) return true;
            else return false;
        }
        return true;
    }
}