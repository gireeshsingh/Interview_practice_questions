class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num<=0) return false;
        int i=1, ans=0;
        while(i*i<=num){
            if(num%i==0) {
                ans+=i;
                if(i*i!=num) ans+=num/i;
            }
            i++;
        }
        return ans-num==num;
    }
}