class BestTimeToBuySellStock2 {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length==0) return 0;
        int i=1, max=0;
        for(i=1;i<prices.length;i++){
            max=max+Math.max(prices[i]-prices[i-1],0);
        }
        return max;
    }
}