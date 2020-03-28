class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int ans=0;
        for(int[] temp: dominoes){
            int x=temp[0], y=temp[1];
            int key=Math.min(x, y)*100 + Math.max(x,y);
            map.put(key, map.getOrDefault(key, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int val=entry.getValue();
            ans+=(val*(val-1))/2;
        }
        return ans;
    }
}