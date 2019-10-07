class NQueens2 {
    int result=0;
    public int totalNQueens(int n) {
        int[][] board=new int[n][n];
        solve(board,0,n);
        return result;
    }
    public void solve(int[][] board, int row, int n){
        if(row==n) {result++; return;}
        for(int i=0;i<n;i++){
            board[row][i]=1;
            if(valid(board, row, i, n))
                solve(board, row+1, n);
            board[row][i]=0;
        }
    }
    public boolean valid(int[][] board, int row, int col, int n){
        for(int i=0;i<n;i++)
            if((board[row][i]==1&&i!=col)||(board[i][col]==1&&i!=row)) return false;
        for(int i=1;i<n;i++){
            if(row-i>=0){
                if(col-i>=0 && board[row-i][col-i]==1) return false;
                if(col+i<n && board[row-i][col+i]==1) return false;}
            if(row+i<n){
                if(col-i>=0 && board[row+i][col-i]==1) return false;
                if(col+i<n && board[row+i][col+i]==1) return false;}
        }
        return true;
    }
}