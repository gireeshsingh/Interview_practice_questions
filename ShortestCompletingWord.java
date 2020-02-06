class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String ans="";
        int min=Integer.MAX_VALUE;
        licensePlate=licensePlate.toLowerCase();
        int[] hs = new int[26];
        for(char c: licensePlate.toCharArray()) if(Character.isLetter(c)) hs[c-97]=hs[c-97]+1;
        System.out.println(Arrays.toString(hs));
        for(String str: words){
            if(str.length()<min){
                String word=str.toLowerCase();
                int[] newArr = new int[26];
                for(char c:word.toCharArray()) if(Character.isLetter(c)) newArr[c-97]=newArr[c-97]+1;
                System.out.println(Arrays.toString(newArr));
                int i=0;
                for(i=0;i<26;i++) if(hs[i]>newArr[i]) break;
                if(i==26) {min=word.length(); ans=str;}
            }
        }
        return ans;
    }
}