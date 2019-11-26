public class NumberOf1Bits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ans=0;
        int mask=1;
        for(int i=0;i<32;i++){
            if((mask&n)!=0) ans++;
            mask=mask<<1;
        }
        return ans;
    }
}