class ReachingPoints {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        if(sx==tx&&sy==ty) return true;
        if(sx>tx||sy>ty||tx==ty) return false;
        if(tx>ty){
            int n = (tx-sx)/ty;
            int nx = 0;
            if(n>0) nx = tx-n*ty;
            else nx = tx-ty;
            return reachingPoints(sx, sy, nx, ty);
        }
        else{
            int n = (ty-sy)/tx;
            int ny = 0;
            if(n>0) ny = ty-n*tx;
            else ny = ty-tx;
            return reachingPoints(sx, sy, tx, ny);
        }
    }
}