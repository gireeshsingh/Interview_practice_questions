class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j=0, res=0;
        for(int i=0; i<g.length && j<s.length; i++){
            while(j<s.length && g[i]>s[j]) j++;
            if(j<s.length && g[i]<=s[j]) {
                res++;
                j++;
            }
        }
        return res;
    }
}