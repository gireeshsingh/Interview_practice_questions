class Solution {
    public int countSquares(int[][] matrix) {
        int answer=0;
        for(int i=1;i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                if(matrix[i][j]==0) continue;
                matrix[i][j]=Math.min(matrix[i-1][j-1], Math.min(matrix[i-1][j], matrix[i][j-1]))+1;
                answer+=matrix[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++) answer+=matrix[i][0];
        for(int i=1;i<matrix[0].length; i++) answer+=matrix[0][i];
        return answer;
    }
    
    
}