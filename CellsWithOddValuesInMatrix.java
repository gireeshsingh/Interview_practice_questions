class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        HashMap<Integer, Integer> map= new HashMap();
        int ans=0;
        for(int[] index: indices){
            int row=index[0];
            int col=index[1];
            for(int i=0;i<m;i++){
                int key=1000000+1000*row+i;
                map.put(key, map.getOrDefault(key, 0)+1);
            }
            for(int i=0;i<n; i++){
                int key=1000000+1000*i+col;
                map.put(key, map.getOrDefault(key, 0)+1);
            }
        }
        for(int i: map.values()){
            if(i%2==1) ans++;
        }
        return ans;
    }
}