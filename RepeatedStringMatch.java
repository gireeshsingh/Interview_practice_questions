class Solution {
    public int repeatedStringMatch(String A, String B) {
        int ans=1;
        for(String s: B.split("")) if(!A.contains(s)) return -1;
        if(A.contains(B)) return ans;
        String temp=A;
        while(temp.length()<2*B.length() || ans<3){
            temp+=A; ans++;
            if(temp.contains(B)) return ans;
        }
        return -1;
    }
    public int[] helper(String A){
        int[] res = new int[26];
        for(char c: A.toCharArray()) res[c-'a']++;
        return res;
    }
}