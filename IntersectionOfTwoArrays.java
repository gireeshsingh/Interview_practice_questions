class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            int[] temp = nums1;
            nums1= nums2;
            nums2 = temp;
        }
        List<Integer> res = new ArrayList<Integer>();
        HashSet<Integer> set1 = new HashSet(), set2 = new HashSet();
        
        for(int i: nums1) set1.add(i);
        for(int i: nums2) set2.add(i);
        
        for(int i: set1) if(set2.contains(i)) res.add(i);
        
        int[] op = new int[res.size()];
        for(int i=0; i<res.size(); i++){
            op[i]= res.get(i);
        }
        return op;
    }
}