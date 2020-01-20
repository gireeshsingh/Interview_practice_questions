class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        long dividend=numerator;
        long divisor=denominator;
        if(dividend==0) return "0";
        StringBuilder ans=new StringBuilder();
        if(dividend<0^divisor<0) ans.append("-");
        dividend=Math.abs(dividend);
        divisor=Math.abs(divisor);
        ans.append(dividend/divisor);
        long rem=dividend%divisor;
        if(rem==0) return ans.toString();
        ans.append(".");
        HashMap<Long,Integer> map=new HashMap();
        while(rem>0){
            if(map.containsKey(rem)){
                ans.insert(map.get(rem),"(");
                ans.append(")");
                break;
            }
            map.put(rem,ans.length());
            rem*=10;
            ans.append(rem/divisor);
            rem%=divisor;
        }
        return ans.toString();
    }
}