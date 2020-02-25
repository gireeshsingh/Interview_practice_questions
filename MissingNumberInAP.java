class Solution {
    public int missingNumber(int[] arr) {
        int d1=arr[0]-arr[1], d2=arr[1]-arr[2], d=0;
        if(d1==d2) d=d1;
        else d=(arr[0]-arr[2])/3;
        for(int i=0;i<arr.length-1;i++) if(arr[i]-d!=arr[i+1]) return arr[i]-d;
        return arr[0];
    }
}