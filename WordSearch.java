class WordSearch {
    int len;
    public boolean exist(char[][] board, String word) {
        if(word.length()>board.length*board[0].length) return false;
        len=word.length();
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length;j++)
                if(word.charAt(0)==board[i][j])
                    if(dfs(board,i,j,0,word))
                        return true;
        return false;
    }
    public boolean dfs(char[][] board, int i, int j, int k, String word){
        if(k==len) return true;
        if(i<0||j<0||i>=board.length||j>=board[0].length||board[i][j]!=word.charAt(k)) return false;
        char temp=board[i][j];
        board[i][j]='~';
        if(dfs(board,i,j+1,k+1,word)||dfs(board,i,j-1,k+1,word)||dfs(board,i+1,j,k+1,word)||dfs(board,i-1,j,k+1,word))return true;
        board[i][j]=temp;
        return false;
    }
}