class BestTimeToBuySellStock {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length==0) return 0;
        int i=0,max=0, min=prices[0];
        for(i=1;i<prices.length;i++){
            max=Math.max(prices[i]-min,max);
            min=Math.min(prices[i],min);
        }
        return max;
    }
}