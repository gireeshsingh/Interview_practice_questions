class MergeIntervals {
    /*private class IComparator implements Comparator<int[]> {
        @Override
        public int compare(int[] a, int[] b) {
            return ((Integer)a[0]).compareTo(b[0]);
        }
    }*/
    public int[][] merge(int[][] intervals) {
        //IComparator comm=new IComparator();
        Arrays.sort(intervals, (a,b)->((Integer)a[0]).compareTo(b[0])/*comm*/);
        LinkedList<int[]> merged = new LinkedList<int[]>();
        //System.out.println(Arrays.deepToString(intervals));
        for(int[] a: intervals){
            int[] temp=null;
            if(!merged.isEmpty()) temp=merged.getLast(); 
            if(temp==null || temp[1]<a[0]) merged.add(a);
            else {
                temp[1]=Math.max(temp[1], a[1]);
                merged.set(merged.size()-1, temp);
            }
        }
        int[][] res=new int[merged.size()][2];
        int k=-1;
        for(int[] i: merged){
            res[++k]=i;
        }
        return res;
    }
}
