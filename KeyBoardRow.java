class Solution {
    List<Character>[] kb;
    public String[] findWords(String[] words) {
        kb = new List[3];
        List<Character> kb1=new ArrayList(Arrays.asList('q', 'w', 'e', 'r', 't', 'u', 'y', 'i', 'o', 'p'));
        List<Character> kb2=new ArrayList(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
        List<Character> kb3=new ArrayList(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));
        kb[0]=kb1;
        kb[1]=kb2;
        kb[2]=kb3;
        List<String> res=new ArrayList();
        for(String word: words){
            if(checkMethod(word.toLowerCase())) res.add(word);
        }
        return res.toArray(new String[0]); 
    }
    
    public boolean checkMethod(String word){
        char c=word.charAt(0);
        int val=2;
        if(kb[0].contains(c)) val=0;
        else if(kb[1].contains(c)) val=1;
        for(int i=1; i<word.length(); i++){
            int temp=2;
            char ctemp=word.charAt(i);
            if(kb[0].contains(ctemp)) temp=0;
            else if(kb[1].contains(ctemp)) temp=1;
            if(temp!=val) return false;
        }
        return true;
    }
}