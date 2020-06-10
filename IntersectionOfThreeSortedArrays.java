class Solution {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> res = new ArrayList<Integer>();
        int id1=0, id2=0, id3=0;
        while(id1<arr1.length && id2<arr2.length && id3<arr3.length){
            int i=arr1[id1], j=arr2[id2], k = arr3[id3];
            if(i==j && i==k){
                res.add(i);
                id1++;
                id2++;
                id3++;
            }
            else{
                if(i<j || i<k) id1++;
                if(j<i || j<k) id2++;
                if(k<i || k<j) id3++;
            }         
        }
        return res;
    }
}