class UniqueNumberOfOccurances {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        HashSet<Integer> hs=new HashSet<Integer>();
        int flag=1,i=0;
        for(i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]) flag++;
            else {
                if(hs.contains(flag)) return false;
                hs.add(flag); flag=1;
            }
        }
        if(hs.contains(flag)) return false;
        return true;
    }
}