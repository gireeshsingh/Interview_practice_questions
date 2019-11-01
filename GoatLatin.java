class GoatLatin {
    public String toGoatLatin(String S) {
        Set<Character> vset=new HashSet<Character>();
        for(char c: new char[]{'a','e','i','o','u','A','E','I','O','U'}) vset.add(c);
        int index=1;
        StringBuilder ans= new StringBuilder();
        for(String w: S.split(" ")){
            if(vset.contains(w.charAt(0))) ans.append(w);
            else{
                ans.append(w.substring(1));
                ans.append(w.substring(0,1));
            }
            ans.append("ma");
            for(int i=0;i<index;i++) ans.append("a");
            index++;
            ans.append(" ");
        }
        ans.deleteCharAt(ans.length()-1);
        return ans.toString();
    }
}