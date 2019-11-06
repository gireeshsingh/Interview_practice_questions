class ValidBoomerang {
    public boolean isBoomerang(int[][] points) {
        int x1 = points[0][0];
        int y1 = points[0][1];
        int x2 = points[1][0];
        int y2 = points[1][1];
        int x3 = points[2][0];
        int y3 = points[2][1];
        if(x2==x1){
            if(y2==y1)return false;
            if(x3==x1)return false;
            return true;
        }
        if(x2==x3){
            if(y2==y3)return false;
            if(x1==x2)return false;
            return true;
        }
        if(x1==x3){
            if(y1==y3)return false;
            if(x1==x2)return false;
            return true;
        }
        int slope = (y2-y1)/(x2-x1);
        
        int intercept = y1 - (slope*x1);
        if (!(slope*x2+intercept == y2))return true;
        if(!(slope*x3+intercept==y3))return true;
        return false;
        
    }
}