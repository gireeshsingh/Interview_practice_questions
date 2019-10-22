class AllPathsFromSouceToTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res=new ArrayList<>();
        helper(graph,0, new ArrayList<Integer>(Arrays.asList(0)), res);
        return res;
    }
    public void helper(int[][] graph, int node, List<Integer> list, List<List<Integer>> res){
        if(node==graph.length-1){res.add(new ArrayList<Integer>(list)); return;}
        for(int i: graph[node]) {list.add(i); helper(graph, i, list, res); list.remove(list.size()-1);}
    }
}