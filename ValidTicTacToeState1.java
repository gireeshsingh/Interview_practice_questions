class ValidTicTacToeState1 {
    public boolean validTicTacToe(String[] board) {
        String[] col=new String[3];
        int Xmoves=0, Ymoves=0, Xwin=0, Ywin=0;
        for(String str: board){
            String temp=str.replaceAll("X","");
            if(temp.length()==0) Xwin=1;
            Xmoves+=3-temp.length();
            temp=str.replaceAll("O", "");
            if(temp.length()==0) Ywin=1;
            Ymoves+=3-temp.length();
            col[0]=(col[0]==null?"":col[0])+str.charAt(0);
            col[1]=(col[1]==null?"":col[1])+str.charAt(1);
            col[2]=(col[2]==null?"":col[2])+str.charAt(2);
        }
        if(Ymoves>Xmoves || Xmoves-Ymoves>1) return false;
        for(String str: col){
            String temp=str.replaceAll("X","");
            if(temp.length()==0) Xwin=1;
            temp=str.replaceAll("O", "");
            if(temp.length()==0) Ywin=1;
        }
        if((board[0].charAt(0)==board[1].charAt(1) && board[1].charAt(1)==board[2].charAt(2))
            ||(board[0].charAt(2)==board[1].charAt(1) && board[1].charAt(1)==board[2].charAt(0))){
            if(board[1].charAt(1) =='X') Xwin=1;
            else if(board[1].charAt(1)=='O') Ywin=1;
        }
        if(Xwin==1 && Ywin==1) return false;
        if(Xwin==1 && Xmoves==Ymoves) return false;
        if(Ywin==1 && Xmoves!=Ymoves) return false;
        return true;
    }
}