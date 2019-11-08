class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
        for (int i: nums) hm.put(i, hm.getOrDefault(i,0)+1);
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>((a,b)->hm.get(b)-hm.get(a));
        for(int n: hm.keySet()) pq.add(n);
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<k;i++) list.add(pq.poll());
        return list;
    }
}