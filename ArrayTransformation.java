class Solution {
    public List<Integer> transformArray(int[] arr) {
        List<Integer> res= new ArrayList<Integer>();
        int size=arr.length;
        int[] prev=new int[size], next=new int[size];
        prev[0]=Integer.MIN_VALUE;
        next[0]=arr[0];
        next[size-1]=arr[size-1];
        while(!Arrays.equals(prev,arr)){
            for(int i=1;i<size-1; i++){
                if(arr[i]<arr[i-1] && arr[i]<arr[i+1]) next[i]=arr[i]+1;
                else if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) next[i]=arr[i]-1;
                else next[i]=arr[i];
            }
            prev=arr.clone();
            arr=next.clone();
        }
        for(int i: arr) res.add(i);
        return res;
    }
}