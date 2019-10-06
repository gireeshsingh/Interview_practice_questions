class LetterCombinationOfPhoneNumber {
    HashMap<Character,List<String>> hm=new HashMap<Character,List<String>>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return new ArrayList<String>();
        hm.put('2', Arrays.asList("a","b","c"));
        hm.put('3', Arrays.asList("d","e","f"));
        hm.put('4', Arrays.asList("g","h","i"));
        hm.put('5', Arrays.asList("j","k","l"));
        hm.put('6', Arrays.asList("m","n","o"));
        hm.put('7', Arrays.asList("p","q","r","s"));
        hm.put('8', Arrays.asList("t","u","v"));
        hm.put('9', Arrays.asList("w","x","y","z"));
        return helper(digits, 0, "");
    }
    public List<String> helper(String digits, int pos, String cur){
        List<String> res = new ArrayList<String>();
        if(pos==digits.length()){res.add(cur);return res;} 
        for(String str: hm.get(digits.charAt(pos)))
            res.addAll(helper(digits, pos+1, cur+str));
        return res;
    }
}