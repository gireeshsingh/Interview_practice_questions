class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];
        int i=0,j=0,index=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr[index++]=nums1[i++];
            }
            else{
                arr[index++]=nums2[j++];
            }
        }
        
        while(j<n){
            arr[index++]=nums2[j++];
        }
        while(i<m){
            arr[index++]=nums1[i++];
        }
        for(i=0;i<(m+n);i++)
            nums1[i]=arr[i];
    }
}