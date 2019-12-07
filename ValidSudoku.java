class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!=".".charAt(0)){
                    if(!valid(board, i,j)) return false;
                }
            }
        }
        return true;
    }
    
    public boolean valid(char[][] board, int row, int col){
        char val = board[row][col];
        for(int i=0;i<9;i++)
            if((board[row][i]==val &&(i!=col))||(board[i][col]==val&&(i!=row)))return false;
        int lowr=(row/3)*3,lowc=(col/3)*3;
        for(int i=lowr;i<lowr+3; i++)
            for(int j=lowc;j<lowc+3; j++)
                if(board[i][j]==val && !(i==row && j==col)) return false;    
        return true;
    }
}