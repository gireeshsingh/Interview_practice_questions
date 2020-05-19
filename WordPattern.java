class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] arr = str.split(" ");
        if(pattern.length()!=arr.length) return false;
        HashSet<String> set = new HashSet<String>();
        String[] res = new String[26];
        for(int i=0; i<pattern.length(); i++){
            int k = pattern.charAt(i)-'a';
            if(res[k]==null) {
                String temp = arr[i];
                if(set.contains(temp)) return false;
                res[k]= temp;
                set.add(temp);
            }
            else if(!res[k].equals(arr[i])) return false;
        }
        return true;
    }
}