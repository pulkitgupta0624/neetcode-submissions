class NumMatrix {

    int[][] ps;
    public NumMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        ps = new int[r+1][c+1];

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                ps[i+1][j+1] = ps[i][j+1] + ps[i+1][j] - ps[i][j] + matrix[i][j]; 
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = ps[row2+1][col2+1] - ps[row2+1][col1] - ps[row1][col2+1] + ps[row1][col1];

        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */