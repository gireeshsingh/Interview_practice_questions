class ReverseWordsInString {
    public String reverseWords(String s) {
        if(s == null || s.trim().length() == 0) return "";
        String ans = "";
        String[] words = s.split(" "); 
        for(int i = words.length-1; i >= 0; i--){
            String clean_string = words[i].trim();
            if(clean_string.length() > 0){
                ans += clean_string + " ";
            }
        }
        int j = ans.length()-1;
        while(ans.charAt(j) == ' '){j--;}
        return ans.substring(0,j+1);
    }
}