class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap();
        for(char c: ransomNote.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(char c: magazine.toCharArray()){
            if(map.containsKey(c)) {
                int val=map.get(c)-1;
                map.put(c, val);
                if(val==0) map.remove(c);
            }
        }
        return map.size()==0;
    }
}