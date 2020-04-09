class Solution {
    
    public int[] gardenNoAdj(int N, int[][] paths) {
        List<Integer>[] network = new List[N+1];
        int[] res = new int[N];
        for(int i=0; i<N+1; i++) network[i]=new ArrayList<Integer>();
        for(int[] path: paths){
            network[path[0]].add(path[1]);
            network[path[1]].add(path[0]);
        }
        res[0]=1;
        for(int i=1; i<N; i++){
            ArrayList<Integer> temp= new ArrayList(Arrays.asList(1,2,3,4));
            for(int j: network[i+1]) temp.remove(Integer.valueOf(res[j-1]));
            res[i]=temp.get(0);
        }
        
        return res;
    }
    
}