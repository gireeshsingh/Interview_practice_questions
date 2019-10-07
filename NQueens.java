class NQueens {
    List<List<String>> res=new ArrayList<List<String>>();
    public List<List<String>> solveNQueens(int n) {
        String[][] board= new String[n][n];
        for(int i=0;i<n;i++) for(int j=0;j<n;j++) board[i][j]=".";
        solve(board, 0, n);
        return res;
    }
    public void solve(String[][] board, int row, int n){
        if(row==n) {
            List<String> ans=new ArrayList<String>();
            for(int i=0;i<n;i++){
                 ans.add(String.join("",board[i]));
            }
            res.add(ans);
            return;
        }
        for(int i=0;i<n;i++){
            board[row][i]="Q";
            if(valid(board, row, i, n))
                solve(board, row+1, n);
            board[row][i]=".";
        }
    }
    public boolean valid(String[][] board, int row, int col, int n){
        for(int i=0;i<n;i++)
            if((board[row][i].equals("Q")&&i!=col)||(board[i][col].equals("Q")&&i!=row))
                return false;
        for(int i=1;i<n;i++){
            if(row-i>=0){
                if(col-i>=0 && board[row-i][col-i].equals("Q")) return false;
                if(col+i<n && board[row-i][col+i].equals("Q")) return false;}
        }
        return true;
    }
}