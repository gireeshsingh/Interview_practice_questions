class CountPrimes {
    
    public int countPrimes(int n) {
        if(n<3) return 0;
        int res=1;
        for(int i=3;i<n;i++){
            if(isPrime(i)) res++;
        }
        return res;
    }
    
    public boolean isPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }
}