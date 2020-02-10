class Solution {
    public boolean confusingNumber(int N) {
        int old=N;
        HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
        map.put(0,0);
        map.put(1,1);
        map.put(2,-1);
        map.put(3,-1);
        map.put(4,-1);
        map.put(5,-1);
        map.put(6,9);
        map.put(7,-1);
        map.put(8,8);
        map.put(9,6);
        int num=0;
        while(N>0){
            int digit=map.get(N%10);
            num=num*10+digit;
            if(digit==-1) return false;
            N/=10;
        }
        return num!=old;
    }
}