class Solution {

    public List<Integer> findAnagrams(String s, String p) {
        
        int size=p.length();
        List<Integer> res=new ArrayList<Integer>();
        if(s.length()<p.length()) return res;
        HashMap<Character, Integer> ogMap = new HashMap(), tMap=new HashMap();
        
        for(char c:p.toCharArray()){
            ogMap.put(c, ogMap.getOrDefault(c, 0)+1);
        }
        
        for(int i=0; i<p.length(); i++){
            char c=s.charAt(i);
            tMap.put(c, tMap.getOrDefault(c, 0)+1);
        }
        if(ogMap.equals(tMap)) res.add(0);
        
        for(int i=p.length(); i<s.length(); i++){
            char del=s.charAt(i-size);
            char ins=s.charAt(i);
            
            if(tMap.get(del)==1) tMap.remove(del);
            else tMap.put(del, tMap.get(del)-1);
            
            tMap.put(ins, tMap.getOrDefault(ins, 0)+1);
            
            if(tMap.equals(ogMap)) res.add(i-size+1);
        }
        return res;
    }
}