class ValidTicTacToeState {
    public boolean validTicTacToe(String[] board) {
        int Xmoves=0, Ymoves=0, Xwin=0, Ywin=0;
        int[] col=new int[3], row=new int[3], diag = new int[2];
        diag[0]+=board[0].charAt(0)=='X'?1:(board[0].charAt(0)=='O'?-1:0);
        diag[0]+=board[1].charAt(1)=='X'?1:(board[1].charAt(1)=='O'?-1:0);
        diag[0]+=board[2].charAt(2)=='X'?1:(board[2].charAt(2)=='O'?-1:0);
        diag[1]+=board[0].charAt(2)=='X'?1:(board[0].charAt(2)=='O'?-1:0);
        diag[1]+=board[1].charAt(1)=='X'?1:(board[1].charAt(1)=='O'?-1:0);
        diag[1]+=board[2].charAt(0)=='X'?1:(board[2].charAt(0)=='O'?-1:0);
        for(int i=0;i<3;i++){
            col[0]+=board[i].charAt(0)=='X'?1:(board[i].charAt(0)=='O'?-1:0);
            col[1]+=board[i].charAt(1)=='X'?1:(board[i].charAt(1)=='O'?-1:0);
            col[2]+=board[i].charAt(2)=='X'?1:(board[i].charAt(2)=='O'?-1:0);
            for(int j=0;j<3;j++) {
                char temp=board[i].charAt(j);
                if(temp=='X') Xmoves++;
                else if(temp=='O') Ymoves++;
                row[i]+=temp=='X'?1:(temp=='O'?-1:0);
            }
        }
        for(int i=0;i<3;i++){
            if(row[i]==3) Xwin=1;
            else if(row[i]==-3) Ywin=1;
            if(col[i]==3) Xwin=1;
            else if(col[i]==-3) Ywin=1;
        }
        if(diag[0]==3 || diag[1]==3) Xwin=1;
        if(diag[0]==-3||diag[1]==-3) Ywin=1;
        
        if(Ymoves>Xmoves || Xmoves-Ymoves>1) return false;
        if(Xwin==1 && Ywin==1) return false;
        if(Xwin==1 && Xmoves==Ymoves) return false;
        if(Ywin==1 && Xmoves!=Ymoves) return false;
        return true;
    }
}