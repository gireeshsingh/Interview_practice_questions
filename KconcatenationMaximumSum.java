class Solution {
    int mod = (int)Math.pow(10,9)+7;
    public int kConcatenationMaxSum(int[] arr, int k) {
        long kadane=kadane(arr);
        if(k==1) return (int)kadane;
        long prefix=prefix(arr);
        long suffix=suffix(arr);
        long sum=0;
        for(int i:arr) sum+=i;
        if(sum>0) return (int)Math.max(sum*(k-2)%mod+suffix%mod+prefix%mod, kadane%mod);
        return (int)Math.max(kadane%mod, prefix%mod+suffix%mod);
    }
    
    public long kadane(int[] ar){
        long curr=0;
        long max = Integer.MIN_VALUE;
        for(int i: ar){
            curr=curr>0?(curr+i)%mod:i;
            max=Math.max(max, curr);
        }
        return max<0?0:max%mod;
    }
    
    public long prefix(int[] ar){
        long curr=0;
        long max=Integer.MIN_VALUE;
        for(int i: ar){
            curr=(curr+i)%mod;
            max=Math.max(max, curr);
        }
        return max;
    }
    
    public long suffix(int[] ar){
        long curr=0;
        long max=Integer.MIN_VALUE;
        for(int i=ar.length-1; i>=0; i--){
            curr=(curr+ar[i])%mod;
            max=Math.max(max, curr);
        }
        return max;
    }
}