class CompareStingsByFrequencyOfSmallestCharacter {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
       
		int[] counts = new int[12];
		for (String word : words) counts[f(word)]++;
        for (int i=10; i>=0; i--) counts[i] += counts[i+1];       
        
        int[] ans = new int[queries.length];      
		for (int i=0; i<queries.length; i++) ans[i]=counts[f(queries[i])+1];
        return ans;     
    }
       
    private int f(String s) {   
        char minChar = Character.MAX_VALUE;
        int freq = 0;
        for (int i=0; i< s.length(); i++) {
            char ch = s.charAt(i);
            if (ch<minChar) {
                freq=1;
                minChar=ch;                
            }
            else if (ch==minChar) freq++;
        }
        return freq;
    } 
}