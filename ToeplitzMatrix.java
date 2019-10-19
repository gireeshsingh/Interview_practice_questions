class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                int row=i;
                while(++j<matrix[0].length && ++row<matrix.length)
                    if(temp!=matrix[row][j]) return false;
            }
        }
        for(int j=0;j<matrix[0].length;j++){
            for(int i=0;i<matrix.length;i++){
                int temp=matrix[i][j];
                int col=j;
                while(++col<matrix[0].length && ++i<matrix.length)
                    if(temp!=matrix[i][col]) return false;
            }
        }
        return true;
    }
}