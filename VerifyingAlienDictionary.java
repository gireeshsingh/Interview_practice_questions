class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        for(int i=1;i<words.length; i++){
            String prev=words[i-1];
            String curr=words[i];
            int limit = Math.min(prev.length(), curr.length());
            int j=0;
            for(j=0; j<limit; j++){
                char a=prev.charAt(j);
                char b=curr.charAt(j);
                if(order.indexOf(a)>order.indexOf(b)) return false;
                else if(order.indexOf(a)<order.indexOf(b)) break;
            }
            if(j==limit && prev.length()>curr.length()) return false;
        }
        return true;
    }
}