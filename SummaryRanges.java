class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<String>();
        if(nums==null || nums.length==0) return list;
        if(nums.length==1){
            list.add(Integer.toString(nums[0]));
            return list;
        }
        int start=nums[0], i=0, end=0;
        for(i=1; i<nums.length; i++){
            if(nums[i]-nums[i-1]!=1){
                if(start!=nums[i-1]) list.add(start+"->"+nums[i-1]);
                else list.add(Integer.toString(start));
                start=nums[i];
            }
            if(i==nums.length-1){
                if(start!=nums[i]) list.add(start+"->"+nums[i]);
                else list.add(Integer.toString(start));
            }
        }
        return list;
    }
}