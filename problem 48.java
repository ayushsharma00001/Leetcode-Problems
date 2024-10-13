class Solution {
    public static void transpose(int a[][]){
        for(int i = 0 ; i<a.length ; i++){
            for(int j = i+1 ; j<a[0].length ; j++){
                a[i][j] = (a[i][j]+a[j][i]) - (a[j][i] = a[i][j]);
            }
        }
    }
    public void rotate(int[][] matrix) {
        transpose(matrix);
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix[0].length/2 ; j++){
                matrix[i][j] = (matrix[i][j]+matrix[i][matrix[0].length-j-1]) - (matrix[i][matrix[0].length-j-1] = matrix[i][j]);
            }
        }
    }
}