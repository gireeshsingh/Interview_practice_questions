class MaxProductOfWordLength {
    public int maxProduct(String[] words) {
        int [] masks = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            masks[i] = createMask(words[i]);
        }
        int max = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if ((masks[i] & masks[j]) == 0) {
                    max = Math.max(max, words[i].length() * words[j].length());
                }
            }
        }
        return max;
    }
    
    private int createMask(String str) {
        int mask = 0;
        for (int i = 0; i < str.length(); i++) {
            mask |= (1 << charToInt(str.charAt(i)));
        }
        return mask;
    }
    
    private int charToInt(char ch) {
        return ch - 'a';
    }
}