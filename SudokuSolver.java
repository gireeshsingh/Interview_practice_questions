class SudokuSolver {
    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }

    public boolean solve(char[][] board, int row, int col){
        if(row==9&&col==0) return true;
        int tempr=col==8?row+1:row, tempc=col==8?0:col+1;
        if(board[row][col]!='.') return solve(board, tempr, tempc);
        for(char i: new char[]{'1','2','3','4','5','6','7','8','9'}){
            board[row][col]=i;
            if(valid(board, row, col) && solve(board, tempr, tempc)) return true;
            board[row][col]='.';
        }
        return false;
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