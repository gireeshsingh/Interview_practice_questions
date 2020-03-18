class Solution {
    public int rotatedDigits(int N) {
        HashSet<Character> same=new HashSet(Arrays.asList('0','1','8'));
        HashSet<Character> diff=new HashSet(Arrays.asList('2','5','6','9'));
        int ans=0;
        for(int i=1; i<=N; i++){
            String temp=Integer.toString(i);
            int flag=0, j=0;
            for(; j<temp.length(); j++){
                if(same.contains(temp.charAt(j))) continue;
                if(!diff.contains(temp.charAt(j))) break;
                else flag=1;
            }
            if(flag==1 && j==temp.length()) ans++;
        }
        return ans;
    }
}