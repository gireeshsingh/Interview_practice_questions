class TicTacToe {
    
    int[] rows;
    int[] cols;
    int[] diag=new int[2];
    int n;

    /** Initialize your data structure here. */
    public TicTacToe(int n) {
        this.n=n;
        rows=new int[this.n];
        cols=new int[this.n];
    }
    
    /** Player {player} makes a move at ({row}, {col}).
        @param row The row of the board.
        @param col The column of the board.
        @param player The player, can be either 1 or 2.
        @return The current winning condition, can be either:
                0: No one wins.
                1: Player 1 wins.
                2: Player 2 wins. */
    public int move(int row, int col, int player) {
        int curMove=player==1?1:-1;
        
        rows[row]+=curMove;
        cols[col]+=curMove;

        if(col==row) diag[0]+=curMove;
        if(row+col==n-1) diag[1]+=curMove;
        
        int total=n*curMove;
        
        if(rows[row]==total || cols[col]==total || diag[0]==total || diag[1]==total) return player;
        else return 0;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */