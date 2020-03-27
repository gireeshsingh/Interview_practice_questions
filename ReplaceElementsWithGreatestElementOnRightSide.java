class Solution {
    public int[] replaceElements(int[] arr) {
        int[] res= new int[arr.length];
        int i=arr.length-1, max=arr[i];
        res[i--]=-1;
        for(; i>=0; i--){
            res[i]=max;
            max=Math.max(max, arr[i]);
        }
        return res;
    }
}