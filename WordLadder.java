class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(beginWord.equals(endWord) || !wordList.contains(endWord)) return 0;
        if(!wordList.contains(beginWord)) wordList.add(beginWord);
        HashMap<String, List<String>> map = createMap(wordList);
        return findLink(beginWord, endWord, map);
    }
    
    public int findLink(String beginWord, String endWord, HashMap<String, List<String>> map){
        HashSet<String> headVisited = new HashSet<String>();
        headVisited.add(beginWord);
        HashSet<String> tailVisited = new HashSet<String>();
        tailVisited.add(endWord);
        
        HashSet<String> currentHeadWords = new HashSet<String>(headVisited);
        HashSet<String> currentTailWords = new HashSet<String>(tailVisited);
        
        int answer=1, flag=1;
        while(flag==1){
            flag=0;
            HashSet<String> nextHeadWords = new HashSet<String>();
            HashSet<String> nextTailWords = new HashSet<String>();
            for(String currHeadWord: currentHeadWords){
                for(String str: map.get(currHeadWord)){
                    if(headVisited.contains(str)) continue;
                    if(currentTailWords.contains(str)) return answer+1;
                    flag=1;
                    headVisited.add(str);
                    nextHeadWords.add(str);
                }
            }
            currentHeadWords = new HashSet<String>(nextHeadWords);
            answer++;
            for(String currTailWord: currentTailWords){
                for(String str: map.get(currTailWord)){
                    if(tailVisited.contains(str)) continue;
                    if(currentHeadWords.contains(str)) return answer+1;
                    flag=1;
                    tailVisited.add(str);
                    nextTailWords.add(str);
                }
            }
            currentTailWords = new HashSet<String>(nextTailWords);
            answer++;
        }
        return 0;
    }
    
    public HashMap<String, List<String>> createMap(List<String> wordList){
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for(int i=0; i<wordList.size(); i++){
            String pattern = wordList.get(i);
            List<String> list = new ArrayList<String>();
            for(int j=0; j<wordList.size(); j++){
                String temp = wordList.get(j);
                if(i==j || pattern.length()!=temp.length()) continue;
                int count=0;
                for(int k=0; k<temp.length(); k++){
                    if(temp.charAt(k)!=pattern.charAt(k)) count++;
                    if(count==2) break;
                }
                if(count==1) list.add(temp);
            }
            map.put(pattern, list);
        }
        return map;
    }
}