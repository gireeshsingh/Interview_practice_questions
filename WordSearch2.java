class WordSearch2 {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> res=new ArrayList<String>();
        for(String word: words){
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    if(word.charAt(0)==board[i][j] && dfs(board, word, i, j, 0)){
                        if(!res.contains(word))res.add(word);
                    }
                }
            }
        }
        return res;
    }
    public boolean dfs(char[][] b, String w, int i, int j, int k){
        if(k==w.length()) return true;
        if(i<0||j<0||i>=b.length||j>=b[0].length||b[i][j]!=w.charAt(k)) return false;
        char temp=b[i][j];
        b[i][j]='~';
        boolean ans=dfs(b,w,i,j+1,k+1)||dfs(b,w,i,j-1,k+1)||dfs(b,w,i+1,j,k+1)||dfs(b,w,i-1,j,k+1);
        b[i][j]=temp;
        if(ans) return true;
        return false;
    }
}