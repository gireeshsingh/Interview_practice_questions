class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result=new int[nums1.length];
        HashMap<Integer, Integer> hs=new HashMap<Integer, Integer>();
        for(int i=0;i<nums2.length;i++) hs.put(nums2[i],i);
        for(int i=0;i<nums1.length;i++){
            int j=hs.get(nums1[i]);
            if(j==nums2.length-1) result[i]=-1;
            else{
                j++;
                while(j<nums2.length && nums2[j]<=nums1[i]) j++;
                if(j==nums2.length) result[i]=-1;
                else result[i]=nums2[j];
            }
        }
        return result;
    }
}