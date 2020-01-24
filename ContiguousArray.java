class Solution {
    public int findMaxLength(int[] nums) {
        int max=0, sum=0, left=0;
        HashMap<Integer, Integer> map=new HashMap();
        for(int i=0; i<nums.length;i++){
            if(nums[i]==0) sum-=1;
            else sum+=1;
            if(sum==0) max=Math.max(max,i+1);
            else if(map.containsKey(sum)) max=Math.max(max, i- map.get(sum));
            if(!map.containsKey(sum)) map.put(sum, i);
        }
        return max;
    }
}