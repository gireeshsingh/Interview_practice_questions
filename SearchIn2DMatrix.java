class SearchIn2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length-1;
        int col=0;
        while(row>=0 && col<matrix[0].length){
            if(target==matrix[row][col]) return true;
            else if(matrix[row][col]<target) col++;
            else row--;
        }
        return false;
    }
}