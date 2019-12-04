class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<Integer>();
        if(matrix.length==0) return list;
        int i=0,j=0,rowmax=matrix.length,colmax=matrix[0].length, limit=rowmax*colmax;
        int colmin=0, rowmin=0, direction=0;
        int[][] incr={{0,1},{1,0},{0,-1},{-1,0}};
        while(limit>0){
            list.add(matrix[i][j]);
            i=i+incr[direction][0];
            j=j+incr[direction][1];
            if(i<rowmin || i>=rowmax || j<colmin || j>=colmax) {
                if(incr[direction]==incr[0]) {rowmin++; i=rowmin; j=colmax-1;}
                else if(incr[direction]==incr[1]) {colmax--; i=rowmax-1; j=colmax-1;}
                else if(incr[direction]==incr[2]) {rowmax--; i=rowmax-1; j=colmin;}
                else if(incr[direction]==incr[3]) {colmin++; i=rowmin; j=colmin;}
                direction=(direction+1)%4;
            }
            limit--;
        }
        return list;
    }
}