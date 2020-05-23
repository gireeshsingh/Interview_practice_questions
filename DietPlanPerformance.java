class Solution {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int total=0, res=0;
        for(int i=0; i<k; i++) total+=calories[i];
        if(total<lower) res--;
        else if(total>upper) res++;
        for(int i=k; i<calories.length; i++){
            total+=calories[i]-calories[i-k];
            if(total<lower) res--;
            else if(total>upper) res++;
        }
        return res;
    }
}