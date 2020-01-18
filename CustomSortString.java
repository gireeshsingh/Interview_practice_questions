class Solution {
    public String customSortString(String S, String T) {
        int[] arr_S=new int[26], arr_T=new int[26];
        S=S.toLowerCase();
        T=T.toLowerCase();
        for(char c: S.toCharArray()) arr_S[c-97]=arr_S[c-97]+1;
        for(char c: T.toCharArray()) arr_T[c-97]=arr_T[c-97]+1;
        StringBuilder ans=new StringBuilder();
        for(char c:S.toCharArray()){
            int index=c-97;
            if(arr_T[index]>0){
                for(int i=0;i<arr_T[index];i++) ans.append(c);
                arr_T[index]=0;
            }
        }
        for(int i=0; i<26; i++){
            if(arr_T[i]>0) for(int j=0;j<arr_T[i];j++) ans.append((char)(i+97));
        }
        return ans.toString();
    }
}