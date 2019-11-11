class MaxAbsoluteValueExpression {
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
    
    int max1 = Integer.MIN_VALUE;
    int min1 = Integer.MAX_VALUE;
    
    int max2 = Integer.MIN_VALUE;
    int min2 = Integer.MAX_VALUE;
    
    int max3 = Integer.MIN_VALUE;
    int min3 = Integer.MAX_VALUE;
    
    int max4 = Integer.MIN_VALUE;
    int min4 = Integer.MAX_VALUE;
    
    int max5 = Integer.MIN_VALUE;
    int min5 = Integer.MAX_VALUE;
    
    int max6 = Integer.MIN_VALUE;
    int min6 = Integer.MAX_VALUE;
    
    int max7 = Integer.MIN_VALUE;
    int min7 = Integer.MAX_VALUE;
    
    int max8 = Integer.MIN_VALUE;
    int min8 = Integer.MAX_VALUE;
    
    for(int i = 0; i < arr1.length; i++){
        
        max1 = Math.max(max1, arr1[i] + arr2[i] + i); //first case
        min1 = Math.min(max1, arr1[i] + arr2[i] + i); //first case
        
        max2 = Math.max(max2, -arr1[i] + arr2[i] + i); //second case
        min2 = Math.min(min2, -arr1[i] + arr2[i] + i); //second case
        
        max3 = Math.max(max3, arr1[i] - arr2[i] + i); //third case
        min3 = Math.min(min3, arr1[i] - arr2[i] + i); //third case
        
        max4 = Math.max(max4, -arr1[i] - arr2[i] + i); //fourth case
        min4 = Math.min(min4, -arr1[i] - arr2[i] + i); //fourth case
        
        max5 = Math.max(max5, arr1[i] + arr2[i] - i); //fifth case
        min5 = Math.min(min5, arr1[i] + arr2[i] - i); //fifth case
        
        max6 = Math.max(max6, -arr1[i] + arr2[i] - i); //sixth case
        min6 = Math.min(min6, -arr1[i] + arr2[i] - i); //sixth case
        
        max7 = Math.max(max7, arr1[i] - arr2[i] - i); //seventh case
        min7 = Math.min(min7, arr1[i] - arr2[i] - i); //seventh case
        
        max8 = Math.max(max8, -arr1[i] - arr2[i] - i); //eighth case
        min8 = Math.min(min8, -arr1[i] - arr2[i] - i); //eighth case
    }
    
    int bestOfFirstTwoCases = Math.max(max1 - min1, max2 - min2);
    int bestOfSecondTwoCases = Math.max(max3 - min3, max4 - min4);
    int bestOfThirdTwoCases = Math.max(max5 - min5, max6 - min6);
    int bestOfForthTwoCases = Math.max(max7 - min7, max8 - min8);
    
    return Math.max(Math.max(bestOfFirstTwoCases, bestOfSecondTwoCases), Math.max(bestOfThirdTwoCases, bestOfForthTwoCases));
    }
}