class Solution {
    public String getHint(String secret, String guess) {
        int bull=0, cow=0;
        int[] countSecret=new int[10], countGuess= new int[10];
        for(int i=0; i<secret.length(); i++){
            int sec=secret.charAt(i)-'0', ges=guess.charAt(i)-'0';
            if(sec==ges) bull++;
            else{
                if(countGuess[sec]>0) {
                    cow++;
                    countGuess[sec]--;
                }
                else countSecret[sec]++;
                if(countSecret[ges]>0){
                    cow++;
                    countSecret[ges]--;
                }
                else countGuess[ges]++;
            }
        }
        return bull+"A"+cow+"B";
    }
}