class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0, n=cardPoints.length;
        for(int i=n-1; i>=n-k ; i--) sum+=cardPoints[i];
        int res=sum;
        for(int i=0; i<k; i++){
            sum=sum+cardPoints[i]-cardPoints[n-(k-i)];
            res=Math.max(sum, res);
        }
        return res;
    }
}