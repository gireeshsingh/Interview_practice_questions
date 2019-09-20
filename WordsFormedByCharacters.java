class WordsFormedByCharacters {
    public int countCharacters(String[] words, String chars) {
        if(chars==null || words==null || words.length ==0 || chars.length()==0) 
            return 0;
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for(String str : chars.split(""))
            hm.put(str, hm.getOrDefault(str, 0)+1);
        
        int i=0, count=0;
        HashMap<String, Integer> temphm = new HashMap<String, Integer>();
        for(i=0;i<words.length;i++){
            temphm = (HashMap) hm.clone();
            String[] tempStr=words[i].split("");
            int j=0;
            for(j=0;j<tempStr.length;j++){
                if(temphm.containsKey(tempStr[j])){
                    if(temphm.get(tempStr[j])<=0) break;
                    else temphm.put(tempStr[j], temphm.get(tempStr[j])-1);
                }
                else
                    break;
            }
            if(j==tempStr.length)
                count+=j;
        }
        return count;
    }
}