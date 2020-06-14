class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap();
        HashMap<Integer, Integer> ans = new HashMap();
        for(int i: nums) map.put(i, map.getOrDefault(i,0)+1);
        int count=0;
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            ans.put(e.getKey(), count);
            count+=e.getValue();
        }
        int[] res=new int[nums.length];
        for(int i=0; i<nums.length; i++) res[i]=ans.get(nums[i]);
        
        return res;
    }
}