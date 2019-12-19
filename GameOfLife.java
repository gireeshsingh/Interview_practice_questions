class GameOfLife {
    public void gameOfLife(int[][] board) {
        int[][] temp=new int[board.length][board[0].length], aliveBoard = new int[board.length][board[0].length];
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length; j++){
                int alive=computeAlive(i,j, board);
                aliveBoard[i][j]=alive;
                if(board[i][j]==0){
                    if(alive==3) temp[i][j]=1;
                    else temp[i][j]=0;
                }
                else{
                    if(alive==2 || alive==3) temp[i][j]=1;
                    else temp[i][j]=0;
                }
            }
        }
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length; j++)
                board[i][j]=temp[i][j];
    }
    public int computeAlive(int i, int j, int[][] board){
        int n=board.length-1;
        int m=board[0].length-1;
        int alive=0;
        if(i>0 && board[i-1][j]==1) alive++;
        if(j>0 && board[i][j-1]==1) alive++;
        if(i<n && board[i+1][j]==1) alive++;
        if(j<m && board[i][j+1]==1) alive++;
        if(i>0 && j>0 && board[i-1][j-1]==1) alive++;
        if(i<n && j<m && board[i+1][j+1]==1) alive++;
        if(i>0 && j<m && board[i-1][j+1]==1) alive++;
        if(i<n && j>0 && board[i+1][j-1]==1) alive++;
        return alive;
    }
}