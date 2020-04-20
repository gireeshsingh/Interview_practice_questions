class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length, totalGas=0, startIdx = 0, currGas=0;
        
        for(int i=0; i<n; i++){
            totalGas+=gas[i]-cost[i];
            currGas+=gas[i]-cost[i];
            
            if(currGas<0){
                currGas=0;
                startIdx=i+1;
            }
        }
        
        return totalGas<0? -1:startIdx;
    }
}