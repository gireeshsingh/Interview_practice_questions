class Solution {
    public int calculateTime(String keyboard, String word) {
        HashMap<Character, Integer> map = new HashMap();
        int i=0, res=0, temp;
        
        for(char ch: keyboard.toCharArray()){
            map.put(ch, i++);
        }        
        i=0;
        for(char ch: word.toCharArray()){
            temp=map.get(ch);
            res+=Math.abs(temp-i);
            i=temp;
        }
        
        return res;
    }
}