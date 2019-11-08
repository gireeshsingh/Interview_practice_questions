class DistantBarcodes {
    public int[] rearrangeBarcodes(int[] barcodes) {
        HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
        for (int i: barcodes) hm.put(i, hm.getOrDefault(i,0)+1);
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>((a,b)->hm.get(b)-hm.get(a));
        
        for(int n: hm.keySet()) pq.add(n);
        int i=-1;
        while (pq.size() >= 2) {
            int mc1 = pq.poll();
            int mc2 = pq.poll();
            barcodes[++i]=mc1;
            barcodes[++i]=mc2;
            hm.put(mc1, hm.get(mc1)-1);
            hm.put(mc2, hm.get(mc2)-1);
            if (hm.get(mc1)> 0) pq.add(mc1);
            if (hm.get(mc2)> 0) pq.add(mc2);
        }
        if(pq.size()>0) barcodes[++i]=pq.poll();
        return barcodes;
    }
}