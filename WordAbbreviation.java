class Solution {
    public List<String> wordsAbbreviation(List<String> dict) {
        ArrayList<ArrayList<String>> abbr = new ArrayList<ArrayList<String>>();
        HashMap<String, Integer> count = new HashMap();
        List<String> result= new ArrayList();
        
        for(String word: dict){
            count.put(word, 1);
            ArrayList<String> list=new ArrayList();
            StringBuilder start=new StringBuilder(word.substring(0,1));
            StringBuilder mid=new StringBuilder(word.substring(1, word.length()-1));
            StringBuilder end=new StringBuilder(word.substring(word.length()-1));
            while(mid.length()>1){
                String abbreviation = start.toString()+mid.length()+end.toString();
                list.add(abbreviation);
                count.put(abbreviation, count.getOrDefault(abbreviation, 0)+1);    
                start.append(mid.charAt(0));
                mid.deleteCharAt(0);
            }
            list.add(word);
            abbr.add(list);
        }
        for(int i=0;i<dict.size();i++){
            for(String str: abbr.get(i)){
                if(count.get(str)==1) {
                    result.add(str);
                    break;
                }
            }
        }
        return result;
    }
}