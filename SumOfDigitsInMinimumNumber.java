class Solution {
    public int sumOfDigits(int[] A) {
        int min=Integer.MAX_VALUE;
        for(int i: A) min=Math.min(min, i);
        int sum=0;
        while(min>0){
            sum+=min%10;
            min/=10;
        }
        return 1-sum%2;
    }
}