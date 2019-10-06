class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        if(strs.length==1) return strs[0];
        StringBuilder sb = new StringBuilder("");
        int i=0,j=0;
        while(i<Integer.MAX_VALUE){
            if(i>=strs[0].length()) return sb.toString();
            Character c=strs[0].charAt(i);
            for(j=1;j<strs.length;j++)
                if(i>=strs[j].length() || c!=strs[j].charAt(i)) return sb.toString();
            sb.append(c);
            i++;
        }
        return sb.toString();
    }
}