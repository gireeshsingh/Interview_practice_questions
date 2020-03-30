class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int curX = points[0][0], curY = points[0][1];
        int answer = 0;
        for(int i=1; i<points.length; i++){
            int x = points[i][0], y = points[i][1];
            while(curX!=x || curY!=y){
                if(x==curX) {
                    answer+=Math.abs(y-curY);
                    curY=y;
                    break;
                }
                if(y==curY){
                    answer+=Math.abs(x-curX);
                    curX=x;
                    break;
                }
                if(curX<x){
                    if(curY<y){
                        int min = Math.min(x-curX, y-curY);
                        answer+=min;
                        curX+=min;
                        curY+=min;
                    }
                    else{
                        int min=Math.min(x-curX, curY-y);
                        answer+=min;
                        curX+=min;
                        curY-=min;
                    }
                }
                else{
                    if(curY<y){
                        int min=Math.min(curX-x, y-curY);
                        answer+=min;
                        curX-=min;
                        curY+=min;
                    }
                    else{
                        int min=Math.min(curX-x, curY-y);
                        answer+=min;
                        curX-=min;
                        curY-=min;
                    }
                }
            }
        }
        return answer;
    }
}