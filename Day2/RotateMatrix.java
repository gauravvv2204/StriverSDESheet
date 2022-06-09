//https://leetcode.com/problems/rotate-image/
class Solution {
    public void rotate(int[][] matrix) {
        //transpose the matrix
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse every row
        for(int i=0; i<matrix.length; i++){
            int j=0,k=matrix[0].length-1;
            while(j<=k){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
                j++;
                k--;
            }
        }
    }
}
