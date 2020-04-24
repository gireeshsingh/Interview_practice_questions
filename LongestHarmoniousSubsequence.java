class Solution {
    public int findLHS(int[] nums) {
        int ans=0;
        HashMap<Integer, Integer> map = new HashMap();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
            if (map.containsKey(i + 1))
                ans = Math.max(ans, map.get(i) + map.get(i + 1));
            if (map.containsKey(i - 1))
                ans = Math.max(ans, map.get(i) + map.get(i - 1)); 
        }
        return ans;
    }
}