class KnightDailer {
    int MOD=1_000_000_007;
    HashMap<Integer, List<Integer>> hm=new HashMap<>();
    HashMap<String, Integer> hmap=new HashMap<>();
    public int knightDialer(int N) {
        hm.put(0, Arrays.asList(4,6));
        hm.put(1, Arrays.asList(6,8));
        hm.put(2, Arrays.asList(7,9));
        hm.put(3, Arrays.asList(4,8));
        hm.put(4, Arrays.asList(3,9,0));
        hm.put(5, Arrays.asList());
        hm.put(6, Arrays.asList(1,7,0));
        hm.put(7, Arrays.asList(2,6));
        hm.put(8, Arrays.asList(1,3));
        hm.put(9, Arrays.asList(4,2));
        int total=0;
        for(int i=0;i<10;i++) {
            int temp=helper(i,N-1);
            total+=temp;
            total%=MOD;
        }
        return total%MOD;
    }
    public int helper(int pos, int jump){
        if(jump==0) return 1;
        int tempTotal=0;
        for(int i: hm.get(pos)){
            if(hmap.containsKey(i+":"+(jump-1))) tempTotal+=hmap.get(i+":"+(jump-1));
            else{
                int temp=helper(i, jump-1)%MOD;
                hmap.put(i+":"+(jump-1), temp);
                tempTotal+=temp;
            }
            tempTotal%=MOD;
        }
        return tempTotal%MOD;
    }
}