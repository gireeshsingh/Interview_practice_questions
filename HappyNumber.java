class HappyNumber {
    public boolean isHappy(int n) {
        if(n<0) return false;
        int slow = calc(n), fast = calc(slow);
        while(fast!=slow){
            fast=calc(calc(fast));
            slow=calc(slow);
        }
        return fast==1;
    }
    public int calc(int n){
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum=sum+digit*digit;
            n=n/10;
        }
        return sum;
    }
}