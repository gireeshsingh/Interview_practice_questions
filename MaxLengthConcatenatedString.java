class MaxLengthConcatenatedString {
    public int maxLength(List<String> arr) {
        if (arr == null || arr.size() == 0)
            return 0;
        return backtrack(arr, "", 0, new HashMap<>());
    }
    
    private int backtrack(List<String> list, String str, int pos, Map<String, Integer> cache) {
        if (cache.containsKey(str))
            return cache.get(str);
        if (pos == list.size())
            return str.length();
        
        int max = str.length();        
        for (int i = pos; i < list.size(); i++) {
            if (isUnique(str, list.get(i))) 
                max = Math.max(max, backtrack(list, str + list.get(i), i + 1, cache));            
        }
        cache.put(str, max);
        return max;
    }

    private int computeMask(String a, int mask) {
        for (char c: a.toCharArray()) {
            if ((mask & (1 << c - 'a')) != 0) 
                return -1;
            mask |= 1 << c - 'a';
        }
        return mask;
    }
    
    private boolean isUnique(String a, String b) {
        int mask = computeMask(a, 0);
        return mask != -1 && computeMask(b, mask) != -1;
    }
}