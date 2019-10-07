class LongestSubStringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int max=0,i=0; String res="";
        String[] arr=s.split("");
        while(i<arr.length){
            if(res.contains(arr[i])){
                if(i==arr.length-1) break;
                max=Math.max(max, res.length());
                if(res.length()>1) res=res.substring(1);
                else res="";
            }
            else{res=res+arr[i];i++;}
        }
        return Math.max(max, res.length());
    }
}