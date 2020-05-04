class Solution {
    public boolean canPermutePalindrome(String s) {
        int[] map = new int[128];
        for(int i=0; i<s.length(); i++) map[s.charAt(i)]++;
        int count=0;
        for(int i=0; i<map.length && count<=1; i++){
            count+=map[i]%2;
        }
        return count<=1;
    }
}