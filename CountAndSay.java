class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String res="1";
        for(int i=1; i<n; i++){
            String temp="";
            for(int j=0; j<res.length(); j++){
                int k=1;
                while(j<res.length()-1 && res.charAt(j)==res.charAt(j+1)){
                    k++; j++;
                }
                temp+=k+""+res.charAt(j);
            }
            res=temp;
        }
        return res;
    }
}