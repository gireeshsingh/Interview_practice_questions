class Solution {
    public void duplicateZeros(int[] arr) {
        int count=0, len=arr.length;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0) count++;
        }
        for(int i=len-1; i>=0; i--){
            if(arr[i]==0) {
                count--;
                if(i+count<len) arr[i+count]=0;
                if(i+count+1<len) arr[i+count+1]=0;
            }
            else if(i+count<len) arr[i+count]=arr[i];
        }
    }
}