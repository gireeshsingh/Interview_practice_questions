class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        char[] stone = S.toCharArray();
        char[] jewel = J.toCharArray();
        int count=0;
        for(char s: stone){
            for(char j: jewel){
                if(j==s){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}