class PowerOfFour {
    public boolean isPowerOfFour(int num) {
        if(num==1) return true;
        while(num!=0){
            if(num%4==0) num/=4;
            else if(num==1)return true;
            else return false;
        }
        return num>0 && true;
    }
}